package com.mongodb.dao;

import com.mongodb.entity.OperationLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zl on 17/12/17.
 */
public interface OperationLogDao extends MongoRepository<OperationLog,String> {

}
