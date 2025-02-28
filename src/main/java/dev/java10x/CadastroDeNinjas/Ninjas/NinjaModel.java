package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data // getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;

    @Column (name = "nome")
    private String nome;

    @Column (unique = true, name = "email")
    private String email;

    @Column (name = "idade")
    private int idade;

    //@ManyToOne - um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key ou chave estrangeira
    private MissoesModel missoes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
