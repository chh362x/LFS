package com.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.common.properties.LfsDsProperties;
import com.common.properties.LisDsProperties;
import com.common.properties.MongoDbProperties;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import javax.sql.DataSource;
import java.net.UnknownHostException;
import java.util.Properties;

import static com.alibaba.druid.pool.DruidDataSourceFactory.PROP_DRIVERCLASSNAME;

/**
 * 多数据源配置
 * Created by ZhengL on 2017/12/14.
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private LfsDsProperties lfsDsProperties;
    @Autowired
    private LisDsProperties lisDsProperties;
    @Autowired
    private MongoDbProperties mongoDbProperties;

    @Bean(name="lfsDS")
    @Qualifier("lfsDS")
    @ConfigurationProperties(prefix="lfs.datasource")
    @Primary
    public DataSource lfsDataSource(){
        DataSource dataSource = null;
        try {
            System.out.println("-------------------- 财务数据源初始化 ---------------------");
            Properties pro = new Properties();
            pro.setProperty("type",lfsDsProperties.getDatasource().getType());
            pro.setProperty("url",lfsDsProperties.getDatasource().getUrl());
            pro.setProperty("username",lfsDsProperties.getDatasource().getUsername());
            pro.setProperty("password",lfsDsProperties.getDatasource().getPassword());
            //pro.setProperty(PROP_DRIVERCLASSNAME,lfsDsProperties.getDatasource().getDriverClassName());
            dataSource =  DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(dataSource!=null){
                System.out.println("-------------------- 财务数据源初始化完成---------------------");
            }
        }
        return dataSource;
    }

    @Bean(name = "lisDS")
    @Qualifier("lisDS")
    @ConfigurationProperties(prefix="lis.datasource")
    public DataSource lisDataSource() {
        DataSource dataSource = null;
        try{
            System.out.println("-------------------- LIS数据源初始化---------------------");
            Properties pro = new Properties();
            pro.setProperty("type",lisDsProperties.getDatasource().getType());
            pro.setProperty("url",lisDsProperties.getDatasource().getUrl());
            pro.setProperty("username",lisDsProperties.getDatasource().getUsername());
            pro.setProperty("password",lisDsProperties.getDatasource().getPassword());
            //pro.setProperty(PROP_DRIVERCLASSNAME,lfsDsProperties.getDatasource().getDriverClassName());
            dataSource =  DruidDataSourceFactory.createDataSource(pro);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(dataSource!=null){
                System.out.println("-------------------- LIS数据源初始化完成---------------------");
            }
        }
        return dataSource;
    }


    @Bean(name = RepositoryMongodbConfig.MONGO_TEMPLATE)
    @Qualifier(RepositoryMongodbConfig.MONGO_TEMPLATE)
    public MongoTemplate primaryMongoDataSource() {
        MongoTemplate template = null;
        try{
            System.out.println("-------------------- MongoDB数据源初始化---------------------");
            template = new MongoTemplate(primaryFactory(mongoDbProperties));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(template!=null){
                System.out.println("-------------------- MongoDB数据源初始化完成---------------------");
            }
        }
        return  template;
    }

    @Bean
    public MongoDbFactory primaryFactory(MongoDbProperties mongoDbProperties) throws UnknownHostException {
        MongoClientURI client = new MongoClientURI(mongoDbProperties.getHost());
        return new SimpleMongoDbFactory(client);
    }
}
