package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 子系统信息维护表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_sysmanageinfo")
public class TabSysmanageinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //子系统ID号
    @Id
    private Integer syamanageId;
	
	    //子系统名称
    @Column(name = "sysmanage_name")
    private String sysmanageName;
	
	    //显示图片及路径
    @Column(name = "picname")
    private String picname;
	
	    //系统路径-存相对路径
    @Column(name = "pathurl")
    private String pathurl;
	
	    //打开方式 self–本地打开 blank-远程打开
    @Column(name = "opentype")
    private String opentype;
	
	    //使用标识 Y-系统正在使用 N-系统暂停使用
    @Column(name = "show_mk")
    private String showMk;
	
	    //子系统访问路径
    @Column(name = "child_system_path")
    private String childSystemPath;
	

	/**
	 * 设置：子系统ID号
	 */
	public void setSyamanageId(Integer syamanageId) {
		this.syamanageId = syamanageId;
	}
	/**
	 * 获取：子系统ID号
	 */
	public Integer getSyamanageId() {
		return syamanageId;
	}
	/**
	 * 设置：子系统名称
	 */
	public void setSysmanageName(String sysmanageName) {
		this.sysmanageName = sysmanageName;
	}
	/**
	 * 获取：子系统名称
	 */
	public String getSysmanageName() {
		return sysmanageName;
	}
	/**
	 * 设置：显示图片及路径
	 */
	public void setPicname(String picname) {
		this.picname = picname;
	}
	/**
	 * 获取：显示图片及路径
	 */
	public String getPicname() {
		return picname;
	}
	/**
	 * 设置：系统路径-存相对路径
	 */
	public void setPathurl(String pathurl) {
		this.pathurl = pathurl;
	}
	/**
	 * 获取：系统路径-存相对路径
	 */
	public String getPathurl() {
		return pathurl;
	}
	/**
	 * 设置：打开方式 self–本地打开 blank-远程打开
	 */
	public void setOpentype(String opentype) {
		this.opentype = opentype;
	}
	/**
	 * 获取：打开方式 self–本地打开 blank-远程打开
	 */
	public String getOpentype() {
		return opentype;
	}
	/**
	 * 设置：使用标识 Y-系统正在使用 N-系统暂停使用
	 */
	public void setShowMk(String showMk) {
		this.showMk = showMk;
	}
	/**
	 * 获取：使用标识 Y-系统正在使用 N-系统暂停使用
	 */
	public String getShowMk() {
		return showMk;
	}
	/**
	 * 设置：子系统访问路径
	 */
	public void setChildSystemPath(String childSystemPath) {
		this.childSystemPath = childSystemPath;
	}
	/**
	 * 获取：子系统访问路径
	 */
	public String getChildSystemPath() {
		return childSystemPath;
	}
}
