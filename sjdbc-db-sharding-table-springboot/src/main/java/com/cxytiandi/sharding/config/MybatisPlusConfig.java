package com.cxytiandi.sharding.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.shardingsphere.driver.jdbc.core.datasource.ShardingSphereDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class MybatisPlusConfig {
//    @Resource
//    private DataSource dataSource;
//
//
//    @Bean
//    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//
//        // 设置 MyBatis Plus 的配置
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.setLogImpl(StdOutImpl.class);
//        sqlSessionFactoryBean.setConfiguration(configuration);
//
//        return sqlSessionFactoryBean;
//    }

//    @Bean
//    public ShardingSphereDataSource dataSource() {
//        // 使用 Sharding-JDBC 提供的数据源
//        return DataSourceBuilder.create().type(ShardingSphereDataSource.class).build();
//    }
//
//    @Bean
//    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//
//        // 设置 MyBatis Plus 的配置
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.setLogImpl(StdOutImpl.class);
//        sqlSessionFactoryBean.setConfiguration(configuration);
//
//        return sqlSessionFactoryBean;
//    }

}

