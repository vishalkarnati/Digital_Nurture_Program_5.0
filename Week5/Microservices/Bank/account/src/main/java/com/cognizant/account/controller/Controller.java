package com.cognizant.account.controller;

import com.cognizant.account.classes.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class Controller {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number){
        if (number.equals("009879879773432")){
            return new Account(
                    "009879879773432",
                    "savings",
                    234343
            );
        }
        return null;
    }
}
