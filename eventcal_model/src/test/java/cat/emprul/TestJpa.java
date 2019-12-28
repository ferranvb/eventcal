package cat.emprul;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		final EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
	    final EntityManager em = emf.createEntityManager();
	    
	    System.out.println("*********** Fet ");
	}

}
