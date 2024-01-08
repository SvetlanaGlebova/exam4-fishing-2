import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("exam4-fishing");
        EntityManager manager = factory.createEntityManager();


    }
}
