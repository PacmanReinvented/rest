package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EntityScan(basePackages = {"java"})
@ComponentScan(basePackages = {"java"})
@EnableJpaRepositories(basePackages = {"java"})
//@ResponseBody
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}