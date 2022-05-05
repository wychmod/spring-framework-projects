package com.linkedbear.annotation.a_quickstart.config;

import com.linkedbear.annotation.a_quickstart.bean.Person;
import com.linkedbear.annotation.a_quickstart.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(18);
        person.setName("lifang");
        return person;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        cat.setMaster(person());
        return cat;
    }
}
