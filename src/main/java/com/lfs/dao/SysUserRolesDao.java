package com.lfs.dao;

import com.lfs.entity.SysUsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/12/19.
 */
@Repository
public interface SysUserRolesDao extends JpaRepository<SysUsersRoles,String> {

}
