package util;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;

public class JPAUtil {
    public static void executeQuery(EntityManager manager, String query) {try {
            manager.getTransaction().begin();
            manager.createNativeQuery(query).executeUpdate();
            manager.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(query);
    }
}
