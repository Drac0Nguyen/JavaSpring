package ProjectManager;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class Application {

    @Autowired
    private DataSource dataSource;

    public boolean isDatabaseConnected() {
        try (Connection connection = dataSource.getConnection()) {
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception if needed
            return false;
        }
    }

    public static void main(String[] args) {
        // Run the application and obtain the Spring context
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        // Create an instance of Application and get the dataSource bean from the Spring context
        Application application = context.getBean(Application.class);

        // Check if the database is connected
        if (!application.isDatabaseConnected()) {
            System.out.println("Database is not connected. Exiting application.");
            context.close(); // Close the Spring context
            return;
        }

        // Continue with your application logic here

        // Close the Spring context when the application is finished
        context.close();
    }
}
