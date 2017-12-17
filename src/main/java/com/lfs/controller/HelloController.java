package com.lfs.controller;

import com.mongodb.dao.OperationLogDao;
import com.mongodb.entity.OperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/12/15.
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private OperationLogDao operationLogDao;

    @RequestMapping("/save")
    public OperationLog save(){
        OperationLog log = new OperationLog();
        log.setId("1");
        log.setOpration("操作");
        log.setUserName("我是谁");
        return operationLogDao.save(log);
    }
}
