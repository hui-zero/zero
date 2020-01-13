import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.zero.pojo.Account;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class TestFastJson {

    @Test
    public void fastJsonTest() {
        Account at1 = new Account();
        at1.setId(1);
        at1.setName("11");
        Account at2 = new Account();
        at2.setId(2);
        at2.setName("22");
        ArrayList ls1 = new ArrayList();
        ls1.add(at1);
        ls1.add(at2);
        String atStr = "{\"id\":1,\"name\":\"11\"}";
        String atArrayStr = "[{\"id\":1,\"name\":\"11\"},{\"id\":2,\"name\":\"22\"}]";
        System.out.println("JavaBean转json串-->" + JSONObject.toJSONString(at1));
        System.out.println("json串转JSON对象-->" + JSONObject.parseObject(atStr).get("name"));
        Account a = JSON.parseObject(atStr, Account.class);
        System.out.println("json串转JavaBean-->" + a.getId());
        List la1 = JSON.parseArray(atArrayStr);
        System.out.println("json串转list-->" + la1.get(0) + "---" + la1.size());
        List<Account> la2 = JSON.parseArray(atArrayStr, Account.class);
        System.out.println("json串转list泛型1-->" + la2.get(0).getName() + "---" + la2.size());
        List<Account> la3 = JSON.parseObject(atArrayStr, new TypeReference<List<Account>>(){});
        System.out.println("json串转list泛型2-->" + la3.get(0).getName() + "---" + la3.size());
        Map m1 = JSON.parseObject(atStr);
        System.out.println("json串转map-->" + m1.get("id"));
        Map<String, String> m2 = JSON.parseObject(atStr, new TypeReference<Map<String ,String>>(){});
        System.out.println("json串转map泛型-->" + m2.get("id"));

        LinkedList ls2 = new LinkedList();
        ls2.add(at1);
        ls2.add(at2);
        System.out.println(JSON.toJSONString(ls2));

        Map map = new HashMap();
        map.put("a", "a");
        map.put("b", "b");
        System.out.println(JSON.toJSONString(map));
        String mapStr = "{\"a\":\"a\",\"b\":\"b\"}";
        JSONObject jo = JSON.parseObject(mapStr);
        System.out.println(jo);


        try {
            //反射获取Class对象的三种方法
//            Account act = new Account();
//            Class<?> cl = act.getClass();
//            Class<?> cl = Account.class;
            Class<?> cl = Class.forName("com.zero.pojo.Account");
            Account ac = (Account) cl.newInstance();
            ac.setName("通过反射newInstance创建对象");
            System.out.println(ac.getName());

            System.out.println(cl.getMethods());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
