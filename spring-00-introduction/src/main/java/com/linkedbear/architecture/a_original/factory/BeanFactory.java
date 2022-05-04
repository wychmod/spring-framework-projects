package com.linkedbear.architecture.a_original.factory;

import com.linkedbear.architecture.a_original.dao.DemoDao;
import com.linkedbear.architecture.a_original.dao.impl.DemoDaoImpl;

// 静态工厂
public class BeanFactory {
    public static DemoDao getDemoDao() {
        return new DemoDaoImpl();
    }
}
