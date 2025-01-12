package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem! ";
    }

    //ADICIONAR NINJA (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    //MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }

    //MOSTRAR NINJA POR ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    //ALTERAR DADOS DOS NINJAS (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorid(){
        return "Alterar ninja por id";
    }

    //DELETAR NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId (@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }
}
