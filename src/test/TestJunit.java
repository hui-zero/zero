import com.zero.pojo.Account;
import com.zero.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration("classpath:config/springContext*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJunit {

    @Autowired
    private AccountService accountService;

    @Test
    public void testService() throws Exception{
        List<Account> list = accountService.selectAccount();
        if(null != list && 0 != list.size()){
            for (Account at: list){
                System.out.println(at.getName());
            }
        }
    }
}
