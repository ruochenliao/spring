package com.alibaba.asset.web;

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 容器初始化
 * 1、Spring 核心容器，创建 beanFactory
 * 2、把配置类保存起来
 * 3、解析 bean 定义，反射创建 bean 对象
 * 4、注入 bean 的属性值, 包括依赖的对象属性 @Autowired
 * 5、调用 bean 的后置处理器，可以修改 bean 的属性
 * 6、把创建出来的 bean 放入到单例缓存池 (concurrentHashMap) 中
 * 7、ApplicaitonContext 通过单例缓存中获取 bean
 */
@SpringBootApplication(scanBasePackages={"com.alibaba.asset"})
public class Application {
    public static void main(String[] args){
        //springboot 启动配置
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        //spring 启动配置，是一个用来管理注解bean的容器
        AnnotationConfigApplicationContext springBootContext = new AnnotationConfigApplicationContext(Application.class);

        //配置 XML 启动方式，
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext();
    }
}
