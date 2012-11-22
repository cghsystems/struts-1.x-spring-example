package com.intetech.example.spring.struts

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean

/**
 * @author: chris
 * @date: 21/11/2012
 */
@Configuration
class ApplicationContextConfiguration {

    @Bean
    def springManagedBean() {
        return new SpringManagedBean()
    }

    @Bean(name = "/test")
    def exampleAction() {
        new ExampleAction()
    }
}
