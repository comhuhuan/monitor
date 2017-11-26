package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_sysmanageinfo")
public class TabSysmanageinfo {
    /**
     * 子系统ID号
     */
    @Id
    @Column(name = "syamanage_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte syamanageId;

    /**
     * 子系统名称
     */
    @Column(name = "sysmanage_name")
    private String sysmanageName;

    /**
     * 显示图片及路径
     */
    private String picname;

    /**
     * 系统路径-存相对路径
     */
    private String pathurl;

    /**
     * 打开方式 self–本地打开 blank-远程打开
     */
    private String opentype;

    /**
     * 使用标识 Y-系统正在使用 N-系统暂停使用
     */
    @Column(name = "show_mk")
    private String showMk;

    /**
     * 子系统访问路径
     */
    @Column(name = "child_system_path")
    private String childSystemPath;

    /**
     * 获取子系统ID号
     *
     * @return syamanage_id - 子系统ID号
     */
    public Byte getSyamanageId() {
        return syamanageId;
    }

    /**
     * 设置子系统ID号
     *
     * @param syamanageId 子系统ID号
     */
    public void setSyamanageId(Byte syamanageId) {
        this.syamanageId = syamanageId;
    }

    /**
     * 获取子系统名称
     *
     * @return sysmanage_name - 子系统名称
     */
    public String getSysmanageName() {
        return sysmanageName;
    }

    /**
     * 设置子系统名称
     *
     * @param sysmanageName 子系统名称
     */
    public void setSysmanageName(String sysmanageName) {
        this.sysmanageName = sysmanageName;
    }

    /**
     * 获取显示图片及路径
     *
     * @return picname - 显示图片及路径
     */
    public String getPicname() {
        return picname;
    }

    /**
     * 设置显示图片及路径
     *
     * @param picname 显示图片及路径
     */
    public void setPicname(String picname) {
        this.picname = picname;
    }

    /**
     * 获取系统路径-存相对路径
     *
     * @return pathurl - 系统路径-存相对路径
     */
    public String getPathurl() {
        return pathurl;
    }

    /**
     * 设置系统路径-存相对路径
     *
     * @param pathurl 系统路径-存相对路径
     */
    public void setPathurl(String pathurl) {
        this.pathurl = pathurl;
    }

    /**
     * 获取打开方式 self–本地打开 blank-远程打开
     *
     * @return opentype - 打开方式 self–本地打开 blank-远程打开
     */
    public String getOpentype() {
        return opentype;
    }

    /**
     * 设置打开方式 self–本地打开 blank-远程打开
     *
     * @param opentype 打开方式 self–本地打开 blank-远程打开
     */
    public void setOpentype(String opentype) {
        this.opentype = opentype;
    }

    /**
     * 获取使用标识 Y-系统正在使用 N-系统暂停使用
     *
     * @return show_mk - 使用标识 Y-系统正在使用 N-系统暂停使用
     */
    public String getShowMk() {
        return showMk;
    }

    /**
     * 设置使用标识 Y-系统正在使用 N-系统暂停使用
     *
     * @param showMk 使用标识 Y-系统正在使用 N-系统暂停使用
     */
    public void setShowMk(String showMk) {
        this.showMk = showMk;
    }

    /**
     * 获取子系统访问路径
     *
     * @return child_system_path - 子系统访问路径
     */
    public String getChildSystemPath() {
        return childSystemPath;
    }

    /**
     * 设置子系统访问路径
     *
     * @param childSystemPath 子系统访问路径
     */
    public void setChildSystemPath(String childSystemPath) {
        this.childSystemPath = childSystemPath;
    }
}