package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 系统配置表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_sysconfig")
public class TabSysconfig implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String configid;
	
	    //
    @Column(name = "defaultval")
    private String defaultval;
	
	    //
    @Column(name = "configval")
    private String configval;
	
	    //
    @Column(name = "note")
    private String note;
	

	/**
	 * 设置：
	 */
	public void setConfigid(String configid) {
		this.configid = configid;
	}
	/**
	 * 获取：
	 */
	public String getConfigid() {
		return configid;
	}
	/**
	 * 设置：
	 */
	public void setDefaultval(String defaultval) {
		this.defaultval = defaultval;
	}
	/**
	 * 获取：
	 */
	public String getDefaultval() {
		return defaultval;
	}
	/**
	 * 设置：
	 */
	public void setConfigval(String configval) {
		this.configval = configval;
	}
	/**
	 * 获取：
	 */
	public String getConfigval() {
		return configval;
	}
	/**
	 * 设置：
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 获取：
	 */
	public String getNote() {
		return note;
	}
}
