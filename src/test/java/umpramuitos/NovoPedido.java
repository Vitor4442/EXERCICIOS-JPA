package umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import teste.basico.UmPraMuitos.ItemPedido;
import teste.basico.UmPraMuitos.Pedido;

import java.math.BigDecimal;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Mouse", new BigDecimal("23.23"));
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();
    }
}
