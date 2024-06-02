package pl.mbaracz.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.mbaracz.todoapp.config.CrossOriginConfig;

@SpringBootApplication
public class SpringTodoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringTodoApplication.class, args);
    }
}
