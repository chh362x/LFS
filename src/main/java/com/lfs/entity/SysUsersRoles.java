package com.lfs.entity;

import com.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zl on 17/12/17.
 */
@Entity
@Table(name = "SYS_USERS_ROLES")
@Getter
@Setter
public class SysUsersRoles extends BaseEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid")
    private String id;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "ROLE_ID")
    private String roleId;
}
