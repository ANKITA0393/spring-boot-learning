package com.example.SpringBootConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication      //works same of @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan combined
public class SpringBootConceptsApplication {

	public static void main(String[] args) {
        ApplicationContext context =
		SpringApplication.run(SpringBootConceptsApplication.class, args);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
	}

    @Bean
    public UserService getUserServiceBean(){
        return new UserService();
    }

}
