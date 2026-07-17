package com.cognizant.loan.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Loan {
    private String number;
    private String type;
    private Integer loan;
    private Integer emi;
    private Integer tenure;
}
