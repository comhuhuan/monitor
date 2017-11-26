package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tab_sys_user")
public class TabSysUser {
    @Id
    @Column(name = "user_id")
    private String userId;

    private String password;

    private String username;

    private String tel;

    private String email;

    private Boolean state;

    @Column(name = "last_time")
    private Date lastTime;

    @Column(name = "login_amount")
    private Integer loginAmount;

    /**
     * 用户是谁创建用户
     */
    private String createuser;

    /**
     * 该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
     */
    private String sysmanage;

    private String uuid;

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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return state
     */
    public Boolean getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * @return last_time
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * @param lastTime
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * @return login_amount
     */
    public Integer getLoginAmount() {
        return loginAmount;
    }

    /**
     * @param loginAmount
     */
    public void setLoginAmount(Integer loginAmount) {
        this.loginAmount = loginAmount;
    }

    /**
     * 获取用户是谁创建用户
     *
     * @return createuser - 用户是谁创建用户
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 设置用户是谁创建用户
     *
     * @param createuser 用户是谁创建用户
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
     *
     * @return sysmanage - 该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
     */
    public String getSysmanage() {
        return sysmanage;
    }

    /**
     * 设置该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
     *
     * @param sysmanage 该用户拥有的子系统权限，多个用｜线分隔，每个ID对应表 tab_sysmanageinfo.syamanage_id值
     */
    public void setSysmanage(String sysmanage) {
        this.sysmanage = sysmanage;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}