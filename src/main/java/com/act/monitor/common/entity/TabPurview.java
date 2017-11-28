package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 角色权限表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_purview")
public class TabPurview implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "role_id")
    private Integer roleId;
	
	    //
    @Column(name = "program_id")
    private String programId;
	
	    //
    @Column(name = "sec_menu_id")
    private Integer secMenuId;
	
	    //二级菜单页面下所具有的所有操作
    @Column(name = "purview_list")
    private String purviewList;
	
	    //
    @Column(name = "purview_str")
    private String purviewStr;
	
	    //
    @Column(name = "is_usb_verify")
    private String isUsbVerify;
	

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
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：
	 */
	public Integer getRoleId() {
		return roleId;
	}
	/**
	 * 设置：
	 */
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	/**
	 * 获取：
	 */
	public String getProgramId() {
		return programId;
	}
	/**
	 * 设置：
	 */
	public void setSecMenuId(Integer secMenuId) {
		this.secMenuId = secMenuId;
	}
	/**
	 * 获取：
	 */
	public Integer getSecMenuId() {
		return secMenuId;
	}
	/**
	 * 设置：二级菜单页面下所具有的所有操作
	 */
	public void setPurviewList(String purviewList) {
		this.purviewList = purviewList;
	}
	/**
	 * 获取：二级菜单页面下所具有的所有操作
	 */
	public String getPurviewList() {
		return purviewList;
	}
	/**
	 * 设置：
	 */
	public void setPurviewStr(String purviewStr) {
		this.purviewStr = purviewStr;
	}
	/**
	 * 获取：
	 */
	public String getPurviewStr() {
		return purviewStr;
	}
	/**
	 * 设置：
	 */
	public void setIsUsbVerify(String isUsbVerify) {
		this.isUsbVerify = isUsbVerify;
	}
	/**
	 * 获取：
	 */
	public String getIsUsbVerify() {
		return isUsbVerify;
	}
}
