package com.intetech.example.spring.struts

import org.apache.struts.action.ActionForm
import org.apache.struts.action.ActionForward
import org.apache.struts.action.ActionMapping
import org.springframework.web.struts.DispatchActionSupport

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author: chris
 * @date: 21/11/2012
 */
class ExampleAction extends DispatchActionSupport {


    @Override
    ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        def springManagedBean = getWebApplicationContext().getBean("springManagedBean")
        log.info("Executing my Spring managed action")
        springManagedBean.execute();
        return mapping.findForward("Success")

    }
}
