package org.practice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component("userBean")      //this will be the actual IoC container name
public class UserService implements BeanNameAware, ApplicationContextAware {     //VI. Aware interfaces are called

    public UserService(){
        System.out.println("UserService constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: "+ name);
    }

    public String getBean(){
        return "userBean";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is " + applicationContext.getClass());
    }
}
