package mx.com.gm.dao;

import jakarta.persistence.Query;
import mx.com.gm.domain.Domicilio;

import java.util.List;

public class DomicilioDAO extends GenericDAO {
    public List<Domicilio> listar() {
        String consulta = "SELECT d FROM Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void actualizar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void eliminar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Domicilio buscarporId(Domicilio domicilio){
        em = getEntityManager();
        return em.find(Domicilio.class, domicilio.getIdDomicilio());
    }

}
