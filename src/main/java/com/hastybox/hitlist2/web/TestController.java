package com.hastybox.hitlist2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO: Comment
 *
 * @author psy
 * @version $Id$
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
