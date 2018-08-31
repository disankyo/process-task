package com.tigerye.process.service.config;

import com.tigerye.process.service.helper.MybatisHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by walker on 2018/3/28.
 */
@Configuration
@MapperScan(basePackages = "com.tigerye.process.service.pipeline.mapper", sqlSessionFactoryRef = "pipelineSqlSessionFactory")
public class DatapMybatisConfig {

    private static final String MAPPER_PATH = "classpath:com/tigerye/process/service/pipeline/sqlmap/*.xml";

    @Bean(name = "pipelineDataSourceProperties")
    @ConfigurationProperties("pipeline.datasource")
    public DataSourceProperties pipelineDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "pipelineDataSource")
    @ConfigurationProperties("datasource.tomcat")
    public org.apache.tomcat.jdbc.pool.DataSource datapDataSource(@Qualifier("pipelineDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return MybatisHelper.buildDataSource(dataSourceProperties);
    }

    @Bean(name = "pipelineSqlSessionFactory")
    public SqlSessionFactoryBean pipelineSqlSessionFactory(@Qualifier("pipelineDataSource") DataSource dataSource) throws IOException {
        return MybatisHelper.buildSqlSessionFactory(dataSource, MAPPER_PATH);
    }
}
