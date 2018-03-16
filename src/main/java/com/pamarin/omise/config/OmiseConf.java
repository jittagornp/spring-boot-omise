/*
 * Copyright 2018 Pamarin.com
 */

package com.pamarin.omise.config;

import co.omise.Client;
import co.omise.ClientException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt;  
 * create : 2018/03/16
 */
@Configuration
public class OmiseConf {

    @Bean
    public Client newClient() throws ClientException{
        return new Client("pkey_test_5baeimm2qznfpv1nesm", "skey_test_5baeimm3c42e2mbb2y7");
    }
    
}
