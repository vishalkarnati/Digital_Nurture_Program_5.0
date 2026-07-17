package com.cognizant.loan.controller;

import com.cognizant.loan.classes.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class Controller {

    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number){
        if(number.equals("H00987987972342")){
            return new Loan(
                    "H00987987972342",
                    "car",
                    400000,
                    3258,
                    18
            );
        }
        return null;
    }
}
