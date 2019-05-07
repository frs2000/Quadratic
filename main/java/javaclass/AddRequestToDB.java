package javaclass;

import entities.Request;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddRequestToDB {
    private String valueA;
    private String valueB;
    private String valueC;
    private String valueD;
    private String valueError;
    private String valueX1;
    private String valueX2;


    public AddRequestToDB(String valueA, String valueB, String valueC, String valueD, String valueError, String valueX1, String valueX2) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
        this.valueD = valueD;
        this.valueError = valueError;
        this.valueX1 = valueX1;
        this.valueX2 = valueX2;
        //addRequestToDB();
     }


    public void addRequestToDB(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExample1");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            Request request = new Request(valueA, valueB, valueC, valueD, valueError, valueX1, valueX2);

            em.persist(request);

            em.getTransaction().commit();
            em.close();
            emf.close();
    }
}
