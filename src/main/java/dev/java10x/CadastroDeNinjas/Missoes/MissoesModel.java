package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table ( name = "tb_Missoes")

public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  long id;

    private String nome;

    private String dificuldade;

    private NinjaModel ninja;


    @OneToMany (mappedBy = "missoes")
    private List <NinjaModel> ninjas;

    public MissoesModel(long id, String nome, String dificuldade, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public MissoesModel() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
