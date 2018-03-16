/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.omise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/16
 */
@SpringBootApplication
@ComponentScan("com.pamarin")
public class AppStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args);
    }

}
