package com.banking.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payments")
public class PaymentController {

    @RequestMapping("/last")
    public String getLastPayments(){
        return "last";
    }

    @RequestMapping("/favorite")
    public String getFavoritePayments(){
        return "favorite";
    }

    @RequestMapping("/betweenCards")
    public String getBetweenCardsPayments(){
        return "betweenCards";
    }

    @RequestMapping("/toSomeoneElse")
    public String getToSomeoneElsePayments(){
        return "toSomeoneElse";
    }

    @RequestMapping("/internet")
    public String getInternetPayments(){
        return "internet";
    }

    @RequestMapping("/mts")
    public String getMtsPayments(){
        return "mts";
    }

    @RequestMapping("/velcom")
    public String getVelcomPayments(){
        return "velcom";
    }
}
