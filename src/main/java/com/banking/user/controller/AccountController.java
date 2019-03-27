package com.banking.user.controller;

import com.banking.user.domain.Card;
import com.banking.user.domain.PrimaryAccount;
import com.banking.user.domain.User;
import com.banking.user.services.CardService;
import com.banking.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Set;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private CardService cardService;

    @RequestMapping("/primaryAccount")
    public String primaryAccount(Model model, Principal principal){

        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();

        model.addAttribute(primaryAccount);

        return "primaryAccount";
    }

    @RequestMapping("/card")
    public String cardPage(Model model, Principal principal){
        User user = userService.findByUsername(principal.getName());
        Set<Card> cards = user.getCards();
        if (cards.isEmpty()){
            model.addAttribute("noCards", 1);
        } else {
            model.addAttribute("cards", cards);
        }
        return "card";
    }

    @GetMapping("/addCard")
    public String getAddCardPage(){
        return "addCard";
    }

    @PostMapping("/addCard")
    public String addCard(@AuthenticationPrincipal User user,
                          Card card,
                          Model model){
        card.setUser(user);
        card.setSum(0.0);
        cardService.saveCard(card);
        model.addAttribute("addSuccess", true);
        return "addCard";
    }
}
