package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

import java.math.BigDecimal;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", new BigDecimal("2987.78"));

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();
    }
}
