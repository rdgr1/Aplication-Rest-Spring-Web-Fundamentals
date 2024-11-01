package rod.spring.learning_fundamentals.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private double preco;
    private String descricao;
}
