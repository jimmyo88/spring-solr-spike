package app.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("app")
public class MainApplication {

    public void start(AnnotationConfigApplicationContext applicationContext){
        System.out.println();
    }
}
