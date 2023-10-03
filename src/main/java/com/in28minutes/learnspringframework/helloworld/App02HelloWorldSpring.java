package com.in28minutes.learnspringframework.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created By dhhaval thakkar on 2023-09-28
 */

public class App02HelloWorldSpring {

    private static final Logger LOGGER = LoggerFactory.getLogger(App02HelloWorldSpring.class);

    // Step 1: Launch a Spring Context
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Step 2: Configure the things that we want Spring to manage - @Configuration
            LOGGER.info((String) context.getBean("name"));

            LOGGER.info(context.getBean("age").toString());

            LOGGER.info(context.getBean("person").toString());

            LOGGER.info(context.getBean("person2MethodCall").toString());

            LOGGER.info(context.getBean("person3Parameters").toString());

            LOGGER.info(context.getBean("address2").toString());

            LOGGER.info(context.getBean(Address.class).toString());

            // Arrays.stream(context.getBeanDefinitionNames()).forEach(LOGGER::info);
        }
    }
}
