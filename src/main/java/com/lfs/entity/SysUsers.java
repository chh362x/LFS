package com.lfs.entity;

import com.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 系统用户
 * Created by zl on 17/12/17.
 */
@Entity
@Table(name = "SYS_USERS")
@Getter
@Setter
public class SysUsers extends BaseEntity implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid")
    @Column(name="ID",nullable = false,length = 64)
    private String userId;
    @Column(name = "USER_NAME",nullable = false,length = 100)
    private String username;
    @Column(name = "LOGIN_NAME",nullable = false,length = 100)
    private String loginName;
    @Column(name = "PASSWORD",nullable = false,length = 100)
    private String password;
    @Column(name = "LOCKED")
    private Integer locked;
    @Column(name= "ENABLED")
    private Integer enabled;
    @Column(name="EMAIL")
    private String email;


    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(name = "SYS_USERS_ROLES",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<SysRoles> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        List<SysRoles> roles = this.getRoles();
        for(SysRoles role : roles){
            auths.add(new SimpleGrantedAuthority(role.getId()));
        }
        return auths;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
