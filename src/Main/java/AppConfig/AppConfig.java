package AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Controller.ProjectController;
import Repository.ProjectRepository;
import Service.ProjectService;

@Configuration
@ComponentScan(basePackages = "your.base.package")
@PropertySource("classpath:application.properties")

public class AppConfig {

    @Bean
    public ProjectRepository projectRepository() {
        return new ProjectRepository();
    }

    @Bean
    public ProjectService projectService(ProjectRepository projectRepository) {
        return new ProjectService(projectRepository);
    }

    @Bean
    public ProjectController projectController(ProjectService projectService) {
        return new ProjectController(projectService);
    }

//    @Bean
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/project_manager");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Drac@1805");
//        return dataSource;
//    }
}
