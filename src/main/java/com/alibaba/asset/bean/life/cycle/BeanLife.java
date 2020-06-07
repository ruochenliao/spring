package com.alibaba.asset.bean.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;


/**
 * 在 bean 创建过程中，能够串改 bean 的名字，设置 bean 的创建工厂
 *
① 通过构造器或工厂方法创建bean实例
② 为bean的属性设置值和对其他bean的引用
③ 调用bean的初始化方法
④ bean可以使用了
⑤ 当容器关闭时，调用bean的销毁方法
 */
@Component
public class BeanLife implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    /**
     * bean 的名称
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        this.name = s;
        System.out.println("set bean name :" + s);
    }

    /**
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("init beanLife factory");
    }

    /**
     * 属性注入
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties are set");
    }

    /**
     * 销毁
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean");
    }
}
