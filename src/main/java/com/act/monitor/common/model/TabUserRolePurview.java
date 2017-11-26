package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_user_role_purview")
public class TabUserRolePurview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 权限类型 2-超级管理员 3-全国管理员 4-IDC账号
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取权限类型 2-超级管理员 3-全国管理员 4-IDC账号
     *
     * @return role_id - 权限类型 2-超级管理员 3-全国管理员 4-IDC账号
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置权限类型 2-超级管理员 3-全国管理员 4-IDC账号
     *
     * @param roleId 权限类型 2-超级管理员 3-全国管理员 4-IDC账号
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}