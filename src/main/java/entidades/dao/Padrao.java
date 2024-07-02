package entidades.dao;

import entidades.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Padrao {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clinica_louca_jar_1.0-SNAPSHOTPU");
    private static EntityManager em = emf.createEntityManager();
    private static Padrao entidade;
    public static Padrao getInstance(){
       return entidade;
    }
    public Object salvar(Object p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        return p;
    }
    public  Object atualiza(Object o){
        em.getTransaction().begin();
        Object retorno = em.merge(o);
        em.getTransaction().commit();
        return retorno;
    }

    public static List<Pessoa> listar(Object p) {
        return em.createQuery("SELECT p FROM pessoa p ", Pessoa.class)
                .getResultList();
    }
}
