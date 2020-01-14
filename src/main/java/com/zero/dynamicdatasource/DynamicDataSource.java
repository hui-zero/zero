package com.zero.dynamicdatasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{
 
    //定义动态数据源，集成spring提供的AbstractRoutingDataSource，实现determineCurrentLookupKey
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSource();
    }
 
 
 
}