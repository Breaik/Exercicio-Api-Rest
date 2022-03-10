package exbook.book.Entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "livro01")
@Entity(name = "livro01")

public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @Column(name = "livro", nullable = false, length = 20)
    private String livro;

    @Column(name = "nome", nullable = false, length = 20)
    private String nome;

    public BookModel(String nome, AutorModel autor) {
        this.nome = nome;
        this.autor = autor;
    }

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorModel autor;
}
