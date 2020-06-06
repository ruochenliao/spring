package com.alibaba.asset.bean.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.Resource;

@Resource
public class BeanLife implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("init beanLife factory");
    }

    @Override
    public void setBeanName(String s) {
        this.name = s;
        System.out.println("set bean name :" + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties are set");
    }
}
