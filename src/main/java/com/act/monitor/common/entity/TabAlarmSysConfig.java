package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 系统配置表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:40
 */
@Table(name = "tab_alarm_sys_config")
public class TabAlarmSysConfig implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //配置参数名称
    @Id
    private String configid;
	
	    //配置默认值
    @Column(name = "defaultval")
    private String defaultval;
	
	    //
    @Column(name = "configval")
    private String configval;
	
	    //页面显示说明
    @Column(name = "title")
    private String title;
	
	    //配置描述
    @Column(name = "remark")
    private String remark;
	
	    //0-输入框，1-下拉框(暂不支持), 2-开关
    @Column(name = "showtype")
    private String showtype;
	
	    //0-不可配置 1-可配
    @Column(name = "hidden")
    private String hidden;
	
	    //排序字段
    @Column(name = "showseq")
    private Integer showseq;
	

	/**
	 * 设置：配置参数名称
	 */
	public void setConfigid(String configid) {
		this.configid = configid;
	}
	/**
	 * 获取：配置参数名称
	 */
	public String getConfigid() {
		return configid;
	}
	/**
	 * 设置：配置默认值
	 */
	public void setDefaultval(String defaultval) {
		this.defaultval = defaultval;
	}
	/**
	 * 获取：配置默认值
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
	 * 设置：页面显示说明
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：页面显示说明
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：配置描述
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：配置描述
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：0-输入框，1-下拉框(暂不支持), 2-开关
	 */
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	/**
	 * 获取：0-输入框，1-下拉框(暂不支持), 2-开关
	 */
	public String getShowtype() {
		return showtype;
	}
	/**
	 * 设置：0-不可配置 1-可配
	 */
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	/**
	 * 获取：0-不可配置 1-可配
	 */
	public String getHidden() {
		return hidden;
	}
	/**
	 * 设置：排序字段
	 */
	public void setShowseq(Integer showseq) {
		this.showseq = showseq;
	}
	/**
	 * 获取：排序字段
	 */
	public Integer getShowseq() {
		return showseq;
	}
}
