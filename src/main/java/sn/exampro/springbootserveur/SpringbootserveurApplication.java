package sn.exampro.springbootserveur;

import org.hibernate.mapping.Collection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import sn.exampro.springbootserveur.entities.Candidats;

import java.awt.*;
import java.util.stream.Stream;

//@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootserveurApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootserveurApplication.class, args);
    }

}
