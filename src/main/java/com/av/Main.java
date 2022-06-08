package com.av;

import com.av.services.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(Main.class, args);

        ScreeningService service = context.getBean(ScreeningService.class);
        service.startScreening();
    }
}
