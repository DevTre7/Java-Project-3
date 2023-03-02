package com.javaunit3.springmvc;

import com.javaunit3.springmvc.model.MovieEntity;
import com.javaunit3.springmvc.model.VoteEntity;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//PP3-Hibernate- Step3 - Creating a SessionFactory bean
@Configuration
public class HibernateConfig {
    @Bean
    public SessionFactory getFactory() {

        //Add the MovieEntity as an annotated class to the 'SessionFactory'
        SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(MovieEntity.class).addAnnotatedClass(VoteEntity.class).buildSessionFactory();

        return factory;
    }
}
