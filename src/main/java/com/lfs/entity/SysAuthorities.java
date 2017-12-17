package com.lfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系统权限
 * Created by zl on 17/12/17.
 */
@Entity
@Table(name = "SYS_AUTHORITIES")
public class SysAuthorities {

    @Id
    @Column(name = "id")
    private String id;
}
