package com.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ZhengL on 2017/12/18.
 */
@Setter
@Getter
public abstract class BaseEntity implements Serializable {

    @Column(name= "created_time")
    protected Timestamp createdTime;
    @Column(name= "updated_time")
    protected Timestamp updatedTime;
}
