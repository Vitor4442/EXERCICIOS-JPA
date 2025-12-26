package infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.lang.reflect.Type;
import java.util.List;

public class DAO <E> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;
    static {
        try {
            emf = Persistence.createEntityManagerFactory("meuPU");
        } catch (Exception e){

        }
    }
    public DAO(){
        this(null);
    }

    public DAO(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirT() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluir(entidade).fecharT();
    }

    public List<E> obterTodos( ){
        if(classe==null){
            throw new UnsupportedOperationException("Classe nula");
        }

        String jpql = "select e from " + classe.getSimpleName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        return query.getResultList();
    }

    public void fechar(){
        em.close();
    }
}
