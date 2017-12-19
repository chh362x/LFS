package com.lfs.entity;

import com.common.entity.BaseEntity;

/**
 * Created by zl on 17/12/17.
 */
public class SysRolesAuthorty extends BaseEntity {

    private Long roleId;

    private String resId; // 资源标识

    private Boolean read = Boolean.FALSE; // 查看权限

    private Boolean create = Boolean.FALSE; // 新增权限

    private Boolean update = Boolean.FALSE; // 修改权限

    private Boolean delete = Boolean.FALSE; // 删除权限
}
