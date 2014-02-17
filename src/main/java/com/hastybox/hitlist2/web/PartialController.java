package com.hastybox.hitlist2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO: Comment
 *
 * @author psy
 * @version $Id$
 */
@Controller
public class PartialController {

    @RequestMapping(value = "/partial/{templateName}.html", method = RequestMethod.GET)
    public String getTemplate(@PathVariable(value = "templateName") String templateName, Model model) {

        return "partials/" + templateName + " :: partial";

    }

}
