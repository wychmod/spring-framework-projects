package com.linkedbear.basic_dl.d_withanno;

import com.linkedbear.basic_dl.c_oftype.dao.DemoDao;
import com.linkedbear.basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class WithAnnoApplication {
    public static void main(String[] args) throws Exception {
        // 通过配置实现依赖查找
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });
    }
}
