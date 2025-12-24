package modelo.basico;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prod_name", length = 200, nullable = false)
    private String nome;

    @Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
    private java.math.BigDecimal preco;

    public Produto(){
    }

    public Produto(String nome, java.math.BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.math.BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(java.math.BigDecimal preco) {
        this.preco = preco;
    }
}
