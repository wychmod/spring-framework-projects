package com.linkedbear.basic_dl.b_bytype;

import com.linkedbear.architecture.a_original.dao.DemoDao;
import com.linkedbear.basic_dl.b_bytype.bean.Person;
import com.linkedbear.basic_dl.b_bytype.dao.impl.DemoDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person= factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao= factory.getBean(DemoDaoImpl.class);
        System.out.println(demoDao.findAll());
    }
}
