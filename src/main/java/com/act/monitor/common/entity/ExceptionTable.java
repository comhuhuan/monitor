package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:42
 */
@Table(name = "exception_table")
public class ExceptionTable implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //设备类型EU或CU
    @Id
    private String type;
	
	    //设备标识
    @Column(name = "host")
    private String host;
	
	    //实例对象标识
    @Column(name = "instance")
    private String instance;
	
	    //告警指标
    @Column(name = "parameter")
    private String parameter;
	
	    //告警类别名称
    @Column(name = "warningclass")
    private String warningclass;
	
	    //告警级别
    @Column(name = "status")
    private String status;
	
	    //异常主要类型
    @Column(name = "parentclass")
    private Integer parentclass;
	
	    //是否有效  0-无效 1-有效
    @Column(name = "valid")
    private Integer valid;
	
	    //异常详细类型
    @Column(name = "childclass")
    private Integer childclass;
	
	    //告警正文或当前值
    @Column(name = "value")
    private String value;
	
	    //告警影响描述或高门限值
    @Column(name = "max")
    private String max;
	
	    //备用参数或低门限值
    @Column(name = "min")
    private String min;
	
	    //告警产生时间
    @Column(name = "occurtime")
    private String occurtime;
	
	    //网管告警原始序列号
    @Column(name = "alarmid")
    private String alarmid;
	
	    //业务系统
    @Column(name = "appsystem")
    private String appsystem;
	
	    //告警标题
    @Column(name = "alarmtitle")
    private String alarmtitle;
	
	    //附件名
    @Column(name = "attachments")
    private String attachments;
	

	/**
	 * 设置：设备类型EU或CU
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：设备类型EU或CU
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：设备标识
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * 获取：设备标识
	 */
	public String getHost() {
		return host;
	}
	/**
	 * 设置：实例对象标识
	 */
	public void setInstance(String instance) {
		this.instance = instance;
	}
	/**
	 * 获取：实例对象标识
	 */
	public String getInstance() {
		return instance;
	}
	/**
	 * 设置：告警指标
	 */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	/**
	 * 获取：告警指标
	 */
	public String getParameter() {
		return parameter;
	}
	/**
	 * 设置：告警类别名称
	 */
	public void setWarningclass(String warningclass) {
		this.warningclass = warningclass;
	}
	/**
	 * 获取：告警类别名称
	 */
	public String getWarningclass() {
		return warningclass;
	}
	/**
	 * 设置：告警级别
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：告警级别
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：异常主要类型
	 */
	public void setParentclass(Integer parentclass) {
		this.parentclass = parentclass;
	}
	/**
	 * 获取：异常主要类型
	 */
	public Integer getParentclass() {
		return parentclass;
	}
	/**
	 * 设置：是否有效  0-无效 1-有效
	 */
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	/**
	 * 获取：是否有效  0-无效 1-有效
	 */
	public Integer getValid() {
		return valid;
	}
	/**
	 * 设置：异常详细类型
	 */
	public void setChildclass(Integer childclass) {
		this.childclass = childclass;
	}
	/**
	 * 获取：异常详细类型
	 */
	public Integer getChildclass() {
		return childclass;
	}
	/**
	 * 设置：告警正文或当前值
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 获取：告警正文或当前值
	 */
	public String getValue() {
		return value;
	}
	/**
	 * 设置：告警影响描述或高门限值
	 */
	public void setMax(String max) {
		this.max = max;
	}
	/**
	 * 获取：告警影响描述或高门限值
	 */
	public String getMax() {
		return max;
	}
	/**
	 * 设置：备用参数或低门限值
	 */
	public void setMin(String min) {
		this.min = min;
	}
	/**
	 * 获取：备用参数或低门限值
	 */
	public String getMin() {
		return min;
	}
	/**
	 * 设置：告警产生时间
	 */
	public void setOccurtime(String occurtime) {
		this.occurtime = occurtime;
	}
	/**
	 * 获取：告警产生时间
	 */
	public String getOccurtime() {
		return occurtime;
	}
	/**
	 * 设置：网管告警原始序列号
	 */
	public void setAlarmid(String alarmid) {
		this.alarmid = alarmid;
	}
	/**
	 * 获取：网管告警原始序列号
	 */
	public String getAlarmid() {
		return alarmid;
	}
	/**
	 * 设置：业务系统
	 */
	public void setAppsystem(String appsystem) {
		this.appsystem = appsystem;
	}
	/**
	 * 获取：业务系统
	 */
	public String getAppsystem() {
		return appsystem;
	}
	/**
	 * 设置：告警标题
	 */
	public void setAlarmtitle(String alarmtitle) {
		this.alarmtitle = alarmtitle;
	}
	/**
	 * 获取：告警标题
	 */
	public String getAlarmtitle() {
		return alarmtitle;
	}
	/**
	 * 设置：附件名
	 */
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	/**
	 * 获取：附件名
	 */
	public String getAttachments() {
		return attachments;
	}
}
