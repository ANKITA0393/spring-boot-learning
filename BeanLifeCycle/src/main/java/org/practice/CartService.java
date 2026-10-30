package org.practice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService  implements BeanNameAware, ApplicationContextAware
        /*implements InitializingBean , DisposableBean*/{

    Map<Integer, String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: "+ name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is " + applicationContext.getClass());
    }

    public void start(){
        System.out.println("Bean is ready");
        mp.put(1, "Ankita");
        mp.put(2, "Rishabh");
    }

    @PostConstruct
    public void start2(){
        System.out.println("Bean is ready");
        mp.put(1, "Ankita");
        mp.put(2, "Rishabh");
    }

    public void addToCart(){
        System.out.println("Added to cart");
    }

    public String getValue(int key){
        return mp.get(key);
    }

    @PreDestroy
    public void stop(){
        System.out.println("bean is getting destroyed");
    }

//    public void stop(){
//        System.out.println("Bean is getting destroyed");
//    }

//    @Override
//    public void destroy() throws Exception {        //IX.Destruction callbacks
//        mp.clear();
//        System.out.println("bean is getting destroyed");
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {  //tasks that needs to be performed before a method is called is written in this block of method
//        System.out.println("Bean is ready");
//        mp.put(1, "Ankita");
//        mp.put(2, "Rishabh");
//    }

}

//VII. Initialisation callbacks