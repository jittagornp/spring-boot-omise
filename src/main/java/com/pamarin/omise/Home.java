/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.omise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/16
 */
@Controller
public class Home {

    @GetMapping({"", "/"})
    public ModelAndView loadPage() {
        return new ModelAndView("index");
    }

}
