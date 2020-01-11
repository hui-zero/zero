package com.zero.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateFormat {
    public static String dateTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }
}
