package com.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/12/15.
 */
@Component
@ConfigurationProperties(prefix="lis")
@Setter
@Getter
public class LisDsProperties {
    private DataSourceConfig datasource;
}
