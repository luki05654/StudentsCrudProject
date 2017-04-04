package hurtownie.danych;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseCreator {
	private EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("hurtownieDanych");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public DatabaseCreator() {
		entityManager.getTransaction().begin();
		
		
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
}
