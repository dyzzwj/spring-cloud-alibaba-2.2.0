package com.dyzwj.order.service;

import com.dyzwj.order.mapper.AccountMapper;
import com.dyzwj.order.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public void insertAccount(){
        Account account = new Account();
        account.setUserId(1);
        account.setUsed(10);
        account.setTotal(100);
        account.setResidue(20);
        accountMapper.insert(account);
    }

}
