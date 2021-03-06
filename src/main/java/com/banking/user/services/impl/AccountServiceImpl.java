package com.banking.user.services.impl;

import com.banking.user.dao.PrimaryAccountDao;
import com.banking.user.domain.PrimaryAccount;
import com.banking.user.services.AccountService;
import com.banking.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private UserService userService;

    @Override
    public PrimaryAccount createPrimaryAccount() {

        PrimaryAccount primaryAccount = new PrimaryAccount();

        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountNumberGeneration());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    public Integer accountNumberGeneration(){
        int accountNumber = 0;
        accountNumber = (int)((Math.random() * 9000000)+1000000);
        return accountNumber;
    }
}
