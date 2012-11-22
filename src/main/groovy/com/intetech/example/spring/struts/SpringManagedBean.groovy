package com.intetech.example.spring.struts

import groovy.util.logging.Log4j

/**
 * @author: chris
 * @date: 21/11/2012
 */
@Log4j
class SpringManagedBean {

    def execute() {
       log.info("Executing something in my spring managed service")
    }
}
