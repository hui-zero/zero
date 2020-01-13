package com.zero.controller;

import com.zero.pojo.Account;
import com.zero.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;

    /**
     * 获取列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectAccount", method = RequestMethod.GET)
    public String selectAccount(Model model){
        List<Account> list = accountService.selectAccount();
        model.addAttribute("accountList", list);
        return "accountList";
    }

    /**
     * 保存
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        account.setCreateDate(new Date());
        accountService.saveAccount(account);
        return "redirect:/account/selectAccount";
    }

    /**
     * 修改
     * @param account
     * @return
     */
    @RequestMapping("/updateAccount")
    public String updateAccount(Account account){
        accountService.updateAccount(account);
        return "redirect:/account/selectAccount";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteAccount")
    public String deleteAccount(int id){
        accountService.deleteAccount(id);
        return "redirect:/account/selectAccount";
    }

    /**
     * 进入修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/showUpdateAccount")
    public String showUpdateAccount(int id, Model model){
        Account account = accountService.showUpdateAccount(id);
        model.addAttribute("account", account);
        return "accountUpdate";
    }

    /**
     * 页面跳转
     * @param pageName
     * @return
     */
    @RequestMapping("/jumpPage")
    public String jumpPage(String pageName){
        return pageName;
    }
}
