package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:54
 */
@Table(name = "monsys_smallidc_cu_disk_stat")
public class MonsysSmallidcCuDiskStat implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "cuIP")
    private String cuip;
	
	    //1-web 2-inter 3-db
    @Column(name = "cuType")
    private Integer cutype;
	
	    //磁盘分区名字
    @Column(name = "diskName")
    private String diskname;
	
	    //分区总大小（单位G）
    @Column(name = "diskTotalSize")
    private Integer disktotalsize;
	
	    //使用率
    @Column(name = "useRate")
    private String userate;
	
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
	public void setCuip(String cuip) {
		this.cuip = cuip;
	}
	/**
	 * 获取：
	 */
	public String getCuip() {
		return cuip;
	}
	/**
	 * 设置：1-web 2-inter 3-db
	 */
	public void setCutype(Integer cutype) {
		this.cutype = cutype;
	}
	/**
	 * 获取：1-web 2-inter 3-db
	 */
	public Integer getCutype() {
		return cutype;
	}
	/**
	 * 设置：磁盘分区名字
	 */
	public void setDiskname(String diskname) {
		this.diskname = diskname;
	}
	/**
	 * 获取：磁盘分区名字
	 */
	public String getDiskname() {
		return diskname;
	}
	/**
	 * 设置：分区总大小（单位G）
	 */
	public void setDisktotalsize(Integer disktotalsize) {
		this.disktotalsize = disktotalsize;
	}
	/**
	 * 获取：分区总大小（单位G）
	 */
	public Integer getDisktotalsize() {
		return disktotalsize;
	}
	/**
	 * 设置：使用率
	 */
	public void setUserate(String userate) {
		this.userate = userate;
	}
	/**
	 * 获取：使用率
	 */
	public String getUserate() {
		return userate;
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
