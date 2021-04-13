package com.codetiler.controller;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author dream
 * @since 2021/4/8 18:02
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String test(HttpServletRequest request){

        AttributePrincipal principal= (AttributePrincipal) request.getUserPrincipal();
        Map<String,Object> attributes=principal.getAttributes();
        String name=principal.getName();
        return "helloworld";
    }
}
