package com.cognizant.account.classes;

import lombok.Getter;

@Getter
public class Account {
    private String number;
    private String type;
    private Integer balance;

    public Account(String number, String type, Integer balance){
        this.number = number;
        this.type = type;
        this.balance = balance;
    }
}
