package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.math.BigDecimal;
import java.util.List;

public class obterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto: produtos){
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

        double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();

        System.out.println("O valor total dos produtos é R$: " + precoTotal);
    }
}
