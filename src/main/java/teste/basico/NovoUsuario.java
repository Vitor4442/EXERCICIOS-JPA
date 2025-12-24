package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Djalma", "djalma@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
