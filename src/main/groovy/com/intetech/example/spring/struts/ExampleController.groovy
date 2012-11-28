package com.intetech.example.spring.struts

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.annotation.Resource

/**
 * @author: chris
 * @date: 22/11/2012
 */
@Controller
class ExampleController  {

    @Resource(name = "springManagedBean")
    SpringManagedBean springManagedBean

    @RequestMapping("/spring-test")
    public String springTest() {
        springManagedBean.execute()
        return "tilesView"
    }
}
