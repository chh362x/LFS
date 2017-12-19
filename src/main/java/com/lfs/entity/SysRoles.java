package com.lfs.entity;

import com.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * 系统角色
 * Created by zl on 17/12/17.
 */
@Entity
@Table(name = "SYS_ROLES")
@Setter
@Getter
public class SysRoles extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "ROLE_DESC")
    private String roleDesc;
    @Column(name = "STATUS")
    private boolean status;

//    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
//    @JoinTable(name = "SYS_ROLES_AUTHORITIES",
//            joinColumns = {@JoinColumn(name = "role_id")},
//            inverseJoinColumns = {@JoinColumn(name = "authority_id")})
//    private List<SysAuthorities> authorities;

}
