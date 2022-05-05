package com.linkedbear.annotation.a_quickstart;

import com.linkedbear.annotation.a_quickstart.bean.Person;
import com.linkedbear.annotation.a_quickstart.config.QuickstartConfiguration;
import org.springframework.context.ApplicationContext;

public class AnnotationConfigApplicationContext {
    public static void main(String[] args) {
        ApplicationContext ctx = new org.springframework.context.annotation.AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }

}
