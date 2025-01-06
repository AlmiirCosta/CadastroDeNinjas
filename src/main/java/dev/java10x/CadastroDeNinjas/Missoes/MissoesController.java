package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")

public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Ninja criado";
    }

    @PutMapping("/alterarmissao")
    public String alterarMissao(){
        return "Ninja alterado";
    }

    @DeleteMapping("/deletar")
    public String deletarNinja(){
        return "Ninja deletado";
    }

}
