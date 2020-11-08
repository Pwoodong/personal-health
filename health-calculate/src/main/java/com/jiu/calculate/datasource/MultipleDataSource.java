package com.jiu.calculate.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Package com.jiu.bigscreen.datasource
 * ClassName MultipleDataSource.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-10-23 10:04
 **/
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }

}
