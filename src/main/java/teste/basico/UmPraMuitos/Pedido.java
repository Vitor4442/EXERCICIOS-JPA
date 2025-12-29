package teste.basico.UmPraMuitos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Pedido(Date data) {
        this.data = data;
    }

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    public Pedido(){
        this(new Date());
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
