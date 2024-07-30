package com.scalekit.scalekitspringbootexample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("client")
@ComponentScan("controllers")
public class ScalekitSpringBootExampleApplication{

    public static void main(String[] args) {
        SpringApplication.run(ScalekitSpringBootExampleApplication.class, args);
    }

}
