package com.lfs.dao;

import com.lfs.entity.SysUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by ZhengL on 2017/12/19.
 */
@Repository
public interface SysUserDao extends JpaRepository<SysUsers,String> {

    @Query("select a from SysUsers a where a.loginName=?1 and a.enabled=0 ")
    public SysUsers findByLoignName(String loginName);
}
