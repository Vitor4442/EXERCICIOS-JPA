package teste.basico.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorId(1);
        System.out.println(cliente.getAssento().getName());

        dao.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorId(4);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
