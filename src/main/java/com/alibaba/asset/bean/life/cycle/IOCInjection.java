package com.alibaba.asset.bean.life.cycle;

import lombok.Data;

/**
 * 老的注入方式
 */
public class IOCInjection {

    @Data
    private static class HandsomeBody{
        private BeautifulGirl girlFirend;

        public void engage(){
            System.out.println("I am engaging with " + girlFirend.getName());
        }
    }

    @Data
    private static class BeautifulGirl{
        private String name;
        private String requirement;
    }

    public static void main(String[] args) {
        System.out.println("============== 老的注入方式  ============");
        //先实例化
        HandsomeBody steven = new HandsomeBody();
        //实例化自己需要的属性
        BeautifulGirl alice = new BeautifulGirl();
        //设置各类属性
        alice.setName("Alice");
        alice.setRequirement("I want my boyfriend is tall, rich, handsome");
        steven.setGirlFirend(alice);
        //开始使用
        steven.engage();

        System.out.println("============== spring 的注入方式  ============");
        System.out.println("由 spring IOC 容器使用 @Resource 或者 @Autowired 注入，控制反转");
    }
}
