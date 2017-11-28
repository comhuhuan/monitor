package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 系统用户表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:40
 */
@Table(name = "tab_sys_user")
public class TabSysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String userId;
	
	    //
    @Column(name = "password")
    private String password;
	
	    //
    @Column(name = "username")
    private String username;
	
	    //
    @Column(name = "tel")
    private String tel;
	
	    //
    @Column(name = "email")
    private String email;
	
	    //
    @Column(name = "state")
    private Integer state;
	
	    //
    @Column(name = "last_time")
    private Date lastTime;
	
	    //
    @Column(name = "login_amount")
    private Integer loginAmount;
	
	    //用户是谁创建用户
    @Column(name = "createuser")
    private String createuser;
	
	    //该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
    @Column(name = "sysmanage")
    private String sysmanage;
	
	    //
    @Column(name = "uuid")
    private String uuid;
	

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
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取：
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * 设置：
	 */
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	/**
	 * 获取：
	 */
	public Date getLastTime() {
		return lastTime;
	}
	/**
	 * 设置：
	 */
	public void setLoginAmount(Integer loginAmount) {
		this.loginAmount = loginAmount;
	}
	/**
	 * 获取：
	 */
	public Integer getLoginAmount() {
		return loginAmount;
	}
	/**
	 * 设置：用户是谁创建用户
	 */
	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	/**
	 * 获取：用户是谁创建用户
	 */
	public String getCreateuser() {
		return createuser;
	}
	/**
	 * 设置：该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
	 */
	public void setSysmanage(String sysmanage) {
		this.sysmanage = sysmanage;
	}
	/**
	 * 获取：该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
	 */
	public String getSysmanage() {
		return sysmanage;
	}
	/**
	 * 设置：
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：
	 */
	public String getUuid() {
		return uuid;
	}
}
