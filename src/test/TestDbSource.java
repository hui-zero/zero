import com.alibaba.fastjson.JSON;
import com.zero.pojo.Account;
import com.zero.service.AccountService;
import com.zero.dynamicdatasource.DynamicDataSourceHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration("classpath:config/springContext*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDbSource {
    @Autowired
    AccountService accountService;

    @Test
    public void dbSourceTest(){
        List<Account> list = accountService.selectAccount();
        System.out.println("默认druid===>" + JSON.toJSONString(list));

        DynamicDataSourceHolder.setDataSource("dbcpDataSource");
        List<Account> list1 = accountService.selectAccount();
        System.out.println("使用dbcp===>" + JSON.toJSONString(list1));

        DynamicDataSourceHolder.setDataSource("c3p0DataSource");
        List<Account> list2 = accountService.selectAccount();
        System.out.println("使用c3p0===>" + JSON.toJSONString(list2));

        DynamicDataSourceHolder.clearDataSource();
        List<Account> list3 = accountService.selectAccount();
        System.out.println("清除ThreadLocal使用默认druid===>" + JSON.toJSONString(list3));
    }

}
