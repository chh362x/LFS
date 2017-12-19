package com.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by zl on 17/12/17.
 */
@Configuration
@EnableMongoRepositories(basePackages = {"com.mongodb.dao"},
        mongoTemplateRef = RepositoryMongodbConfig.MONGO_TEMPLATE)
public class RepositoryMongodbConfig {
    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
