package com.zero.dao;

import com.zero.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("accountDao")
public interface AccountDao {
    List<Account> selectAccount();
    Account showUpdateAccount(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(@Param("id") int id);
}
