package com.tigerye.process.service.helper;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by walker on 2018/3/26.
 */

public class MybatisHelper {

    public static org.apache.tomcat.jdbc.pool.DataSource buildDataSource(DataSourceProperties dataSourceProperties) {
        org.apache.tomcat.jdbc.pool.DataSource dataSource =
                (org.apache.tomcat.jdbc.pool.DataSource) DataSourceBuilder.create()
                        .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                        .url(dataSourceProperties.getUrl())
                        .username(dataSourceProperties.getUsername())
                        .password(dataSourceProperties.getPassword())
                        .build();

        DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(dataSourceProperties.getUrl());
        String validationQuery = databaseDriver.getValidationQuery();
        if (validationQuery != null) {
            dataSource.setTestOnBorrow(true);
            dataSource.setValidationQuery(validationQuery);
        }
        return dataSource;
    }

    public static SqlSessionFactoryBean buildSqlSessionFactory(DataSource dataSource, String mapperLocation) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(pathResolver.getResources(mapperLocation));
        return sqlSessionFactoryBean;
    }
}
