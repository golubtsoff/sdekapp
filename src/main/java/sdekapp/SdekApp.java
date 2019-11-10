package sdekapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SdekApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SdekApp.class, args);
    }
}
