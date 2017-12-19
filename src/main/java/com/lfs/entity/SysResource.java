package com.lfs.entity;

import com.common.entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 系统资源
 * Created by ZhengL on 2017/12/18.
 */
@Setter
@Getter
public class SysResource extends BaseEntity {

    private Long id;
    private String name;//资源名称
    private Integer type=0;//资源类型（0.菜单，1.操作按钮，2.其他）
    private Integer priority=0; //显示顺序
    private Long pid=0L; //父编号
    private String perm; //权限字符
    private Integer available=0; //资源可见（0：可见，1：不可见）
    private String url; //菜单连接


}
