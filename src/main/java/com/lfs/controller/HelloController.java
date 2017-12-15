package com.lfs.controller;

import com.lis.dao.LisFKYbxxDao;
import com.lis.entity.LisFKYbxxEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by admin on 2017/12/15.
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private LisFKYbxxDao lisFKYbxxDao;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public LisFKYbxxEntity Test(){
        LisFKYbxxEntity ybxx =  lisFKYbxxDao.findOne(1);
        return ybxx;
    }
}
