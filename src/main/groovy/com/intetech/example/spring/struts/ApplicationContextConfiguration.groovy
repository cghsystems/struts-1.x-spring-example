package com.intetech.example.spring.struts

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.context.annotation.ComponentScan

/**
 * @author: chris
 * @date: 21/11/2012
 */
@Configuration
@EnableWebMvc
class ApplicationContextConfiguration {

    @Bean
    def springManagedBean() {
        return new SpringManagedBean()
    }
}
