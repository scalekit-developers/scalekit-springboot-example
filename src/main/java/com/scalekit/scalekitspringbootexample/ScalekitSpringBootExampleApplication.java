package com.scalekit.scalekitspringbootexample;

import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
