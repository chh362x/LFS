package com.lfs.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * 系统角色
 * Created by zl on 17/12/17.
 */
@Entity
@Table(name = "SYS_ROLES")
@Setter
@Getter
public class SysRoles {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "role_id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid")
    private String id;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_desc")
    private String roleDesc;
    @Column(name = "status")
    private boolean status;

    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(name = "SYS_ROLES_AUTHORITIES",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_id")})
    private List<SysAuthorities> authorities;

}
