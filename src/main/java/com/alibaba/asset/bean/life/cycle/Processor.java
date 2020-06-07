package com.alibaba.asset.bean.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * bean 初始化之后可以做这些事情
 *
 * @author john
 */
@Component
public class Processor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLife){
            System.out.println("before init " + bean.getClass().getSimpleName() + " created!");
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
