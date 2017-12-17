package com.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * Created by zl on 17/12/17.
 */
@Setter
@Getter
@Document
public class OperationLog {

    @Id
    private String id;
    private String userName;
    private String opration;

}
