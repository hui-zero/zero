package com.zero.dynamicdatasource;


public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal();

    //将数据源key设置进ThreadLocal
    public static void setDataSource(String dataSource) {
        THREAD_DATA_SOURCE.set(dataSource);
    }

    //获取数据源key
    public static String getDataSource() {
        return (String)THREAD_DATA_SOURCE.get();
    }

    //使用完成后清除ThreadLocal
    public static void clearDataSource() {
        THREAD_DATA_SOURCE.remove();
    }
}