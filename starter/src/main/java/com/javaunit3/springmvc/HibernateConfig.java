package com.javaunit3.springmvc;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//PP3-Hibernate- Step3 - Creating a SessionFactory bean
@Configuration
public class HibernateConfig {
    @Bean
    public SessionFactory getFactory() {

        //Add the MovieEntity as an annotated class to the 'SessionFactory'
        SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(MovieEntity.class).buildSessionFactory();

        return factory;
    }
}
