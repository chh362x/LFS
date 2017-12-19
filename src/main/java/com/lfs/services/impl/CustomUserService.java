package com.lfs.services.impl;

import com.lfs.dao.SysRoleDao;
import com.lfs.dao.SysUserDao;
import com.lfs.dao.SysUserRolesDao;
import com.lfs.entity.SysUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 17/12/17.
 */
@Service("customUserServiceImpl")
public class CustomUserService implements UserDetailsService {

    @Autowired
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysUserRolesDao sysUserRolesDao;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        SysUsers loginUser = sysUserDao.findByLoignName(loginName);
        if(loginUser == null){
            throw new UsernameNotFoundException("该登录名不存在!");
        }else{

        }
        return loginUser;
    }
}
