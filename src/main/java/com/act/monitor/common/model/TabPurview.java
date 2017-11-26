package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_purview")
public class TabPurview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "program_id")
    private String programId;

    @Column(name = "sec_menu_id")
    private Integer secMenuId;

    /**
     * 二级菜单页面下所具有的所有操作
     */
    @Column(name = "purview_list")
    private String purviewList;

    @Column(name = "purview_str")
    private String purviewStr;

    @Column(name = "is_usb_verify")
    private String isUsbVerify;

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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return program_id
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * @param programId
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * @return sec_menu_id
     */
    public Integer getSecMenuId() {
        return secMenuId;
    }

    /**
     * @param secMenuId
     */
    public void setSecMenuId(Integer secMenuId) {
        this.secMenuId = secMenuId;
    }

    /**
     * 获取二级菜单页面下所具有的所有操作
     *
     * @return purview_list - 二级菜单页面下所具有的所有操作
     */
    public String getPurviewList() {
        return purviewList;
    }

    /**
     * 设置二级菜单页面下所具有的所有操作
     *
     * @param purviewList 二级菜单页面下所具有的所有操作
     */
    public void setPurviewList(String purviewList) {
        this.purviewList = purviewList;
    }

    /**
     * @return purview_str
     */
    public String getPurviewStr() {
        return purviewStr;
    }

    /**
     * @param purviewStr
     */
    public void setPurviewStr(String purviewStr) {
        this.purviewStr = purviewStr;
    }

    /**
     * @return is_usb_verify
     */
    public String getIsUsbVerify() {
        return isUsbVerify;
    }

    /**
     * @param isUsbVerify
     */
    public void setIsUsbVerify(String isUsbVerify) {
        this.isUsbVerify = isUsbVerify;
    }
}