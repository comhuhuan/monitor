package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 用户角色表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:40
 */
@Table(name = "tab_user_role_purview")
public class TabUserRolePurview implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "user_id")
    private String userId;
	
	    //权限类型 2-超级管理员 3-全国管理员 4-IDC账号
    @Column(name = "role_id")
    private Integer roleId;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：权限类型 2-超级管理员 3-全国管理员 4-IDC账号
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：权限类型 2-超级管理员 3-全国管理员 4-IDC账号
	 */
	public Integer getRoleId() {
		return roleId;
	}
}
