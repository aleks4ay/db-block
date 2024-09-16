package com.aleks4ay.dbblock;

import com.aleks4ay.dbblock.persistence.DaoAlexHost;
import com.aleks4ay.dbblock.persistence.entity.AlexHost;
import com.aleks4ay.dbblock.persistence.entity.GetAlexDocParameter;
import com.aleks4ay.dbblock.persistence.entity.GetAlexHostParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {
        ErrorMvcAutoConfiguration.class
        ,SecurityAutoConfiguration.class
        , ManagementWebSecurityAutoConfiguration.class
        ,OAuth2ClientAutoConfiguration.class

})
@EnableTransactionManagement
@EnableScheduling
public class SpringBootApp {

    @Autowired
    DaoAlexHost daoAlexHost;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

//    @Bean
//    public CommandLineRunner loadData() {
//        return args -> {
//            daoAlexHost.create(new AlexHost(null, "host number 6"));
//            daoAlexHost.create(new AlexHost(null, "Host for Alyona 2"));
//            System.out.println(daoAlexHost.getAll());
//        };
//    }
}