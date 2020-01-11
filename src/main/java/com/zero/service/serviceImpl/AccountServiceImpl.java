package com.zero.service.serviceImpl;

import com.zero.dao.AccountDao;
import com.zero.pojo.Account;
import com.zero.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    @Override
    public List<Account> selectAccount() {
        System.out.println("Service业务层：查询...");
        return accountDao.selectAccount();
    }

    @Override
    public Account showUpdateAccount(int id){
        System.out.println("Service业务层：修改查询...");
        return accountDao.showUpdateAccount(id);
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存...");
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account){
        System.out.println("Service业务层：修改...");
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(int id){
        System.out.println("Service业务层：删除...");
        accountDao.deleteAccount(id);
    }
}
