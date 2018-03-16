/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.omise;

import co.omise.Client;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/16
 */
@Controller
public class ChargeCtrl {

    @Autowired
    private Client client;

    @ResponseBody
    @PostMapping("/charge")
    public Charge doCharge(@RequestParam("omiseToken") String token) throws Exception {
        return client.charges().create(new Charge.Create()
                .amount(99500) // THB 995.00
                .currency("THB")
                .card(token));
    }

}
