package com.aman.banking.account.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Data;

@Data
public class DepositMoneyCommand {

    @TargetAggregateIdentifier
    private String accountNumber;

    private double depositAmount;

}