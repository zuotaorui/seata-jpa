package com.izx.accountservice.service;

import com.izx.accountservice.entity.Account;
import com.izx.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {
    private static final String ERROR_USER_ID = "1002";

    @Autowired
    private AccountRepository accountDAO;

    @Transactional(rollbackFor = Exception.class)
    public void debit(String userId, BigDecimal num) {
        Account account = accountDAO.findByUserId(userId);
        account.setMoney(account.getMoney().subtract(num));
        accountDAO.save(account);

        if (ERROR_USER_ID.equals(userId)) {
            throw new RuntimeException("account branch exception");
        }
    }

    public List<Account> findAll(){
        return accountDAO.findAll();
    }
}
