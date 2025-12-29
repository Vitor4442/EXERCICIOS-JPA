package umpramuitos;

import infra.DAO;
import teste.basico.UmPraMuitos.ItemPedido;
import teste.basico.UmPraMuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
    DAO<Pedido> dao = new DAO<>(Pedido.class);

    Pedido pedido = dao.obterPorId(1l);

    for(ItemPedido item: pedido.getItens()){
        System.out.println(String.valueOf(item.getQuantidade()));
        System.out.println(item.getProduto().getNome());
    }

    dao.fechar();
    }
}
