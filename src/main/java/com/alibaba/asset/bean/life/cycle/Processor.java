package com.alibaba.asset.bean.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.Resource;

/**
 * @author john
 */
@Resource
public class Processor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLife){
            System.out.println("before init " + beanName + " created!");
        }else{
            System.out.println("initing beans");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLife){
            System.out.println("after destroy " + beanName + " created!");
        }
        return bean;
    }
}
