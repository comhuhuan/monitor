package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:56
 */
@Table(name = "monsys_smallidc_eu_process_stat")
public class MonsysSmallidcEuProcessStat implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "houseID")
    private Long houseid;
	
	    //
    @Column(name = "euID")
    private String euid;
	
	    //进程名
    @Column(name = "process_name")
    private String processName;
	
	    //进程利用内存(MB)
    @Column(name = "memory_use")
    private Integer memoryUse;
	
	    //进程是否异常：1-异常  0-正常
    @Column(name = "pro_status")
    private Integer proStatus;
	
	    //当天累计重启次数
    @Column(name = "reTimes")
    private Integer retimes;
	
	    //进程最后一次启动时间
    @Column(name = "lastReTime")
    private Date lastretime;
	
	    //备用栏
    @Column(name = "reserve0")
    private String reserve0;
	
	    //备用栏
    @Column(name = "reserve1")
    private String reserve1;
	
	    //是否异常：1-异常  0-正常
    @Column(name = "status")
    private Integer status;
	
	    //记录时间
    @Column(name = "recordTime")
    private Date recordtime;
	

	/**
	 * 设置：唯一用户ID
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：唯一用户ID
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：
	 */
	public void setHouseid(Long houseid) {
		this.houseid = houseid;
	}
	/**
	 * 获取：
	 */
	public Long getHouseid() {
		return houseid;
	}
	/**
	 * 设置：
	 */
	public void setEuid(String euid) {
		this.euid = euid;
	}
	/**
	 * 获取：
	 */
	public String getEuid() {
		return euid;
	}
	/**
	 * 设置：进程名
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * 获取：进程名
	 */
	public String getProcessName() {
		return processName;
	}
	/**
	 * 设置：进程利用内存(MB)
	 */
	public void setMemoryUse(Integer memoryUse) {
		this.memoryUse = memoryUse;
	}
	/**
	 * 获取：进程利用内存(MB)
	 */
	public Integer getMemoryUse() {
		return memoryUse;
	}
	/**
	 * 设置：进程是否异常：1-异常  0-正常
	 */
	public void setProStatus(Integer proStatus) {
		this.proStatus = proStatus;
	}
	/**
	 * 获取：进程是否异常：1-异常  0-正常
	 */
	public Integer getProStatus() {
		return proStatus;
	}
	/**
	 * 设置：当天累计重启次数
	 */
	public void setRetimes(Integer retimes) {
		this.retimes = retimes;
	}
	/**
	 * 获取：当天累计重启次数
	 */
	public Integer getRetimes() {
		return retimes;
	}
	/**
	 * 设置：进程最后一次启动时间
	 */
	public void setLastretime(Date lastretime) {
		this.lastretime = lastretime;
	}
	/**
	 * 获取：进程最后一次启动时间
	 */
	public Date getLastretime() {
		return lastretime;
	}
	/**
	 * 设置：备用栏
	 */
	public void setReserve0(String reserve0) {
		this.reserve0 = reserve0;
	}
	/**
	 * 获取：备用栏
	 */
	public String getReserve0() {
		return reserve0;
	}
	/**
	 * 设置：备用栏
	 */
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	/**
	 * 获取：备用栏
	 */
	public String getReserve1() {
		return reserve1;
	}
	/**
	 * 设置：是否异常：1-异常  0-正常
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：是否异常：1-异常  0-正常
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：记录时间
	 */
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	/**
	 * 获取：记录时间
	 */
	public Date getRecordtime() {
		return recordtime;
	}
}
