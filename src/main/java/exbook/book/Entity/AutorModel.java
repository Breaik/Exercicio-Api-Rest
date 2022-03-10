package exbook.book.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor

@Table(name = "autor01")
@Entity(name = "autor01")
public class AutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "autor", nullable = false, length = 20)
    private String autor;
    @Column(name = "nome", nullable = false, length = 20)
    private String nome;

    public AutorModel(String nome) {
        this.nome = nome;
    }
}
