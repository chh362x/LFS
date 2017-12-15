package com.common.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by admin on 2017/12/15.
 */
@Setter
@Getter
public class DataSourceConfig {

    private String type;
    private String url;
    private String username;
    private String password;
}
