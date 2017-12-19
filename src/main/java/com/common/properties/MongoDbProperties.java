package com.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zl on 17/12/17.
 */
@Component
@ConfigurationProperties(prefix="mongodb")
@Setter
@Getter
public class MongoDbProperties {

    private String host;
    private String database;
    private String port;
    private String uri;
}
