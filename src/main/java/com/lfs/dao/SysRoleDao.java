package com.lfs.dao;

import com.lfs.entity.SysRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/12/19.
 */
@Repository
public interface SysRoleDao extends JpaRepository<SysRoles,String> {

}
