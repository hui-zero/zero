package com.zero.service;

import com.zero.pojo.Account;

import java.util.List;

public interface AccountService {
    List<Account> selectAccount();
    Account showUpdateAccount(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(int id);
}
