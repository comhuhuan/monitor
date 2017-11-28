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
@Table(name = "monsys_smallidc_cu_runinfo_stat")
public class MonsysSmallidcCuRuninfoStat implements Serializable {
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
	
	    //1-监测 2-封堵 3-活跃资源 4-活动状态
    @Column(name = "fileType")
    private Integer filetype;
	
	    //接收总文件数
    @Column(name = "totalfileNum")
    private Integer totalfilenum;
	
	    //解析成功文件数
    @Column(name = "praseokNum")
    private Integer praseoknum;
	
	    //解析失败文件数
    @Column(name = "prasefailNum")
    private Integer prasefailnum;
	
	    //未解析文件数
    @Column(name = "nopraseNum")
    private Integer noprasenum;
	
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
	 * 设置：1-监测 2-封堵 3-活跃资源 4-活动状态
	 */
	public void setFiletype(Integer filetype) {
		this.filetype = filetype;
	}
	/**
	 * 获取：1-监测 2-封堵 3-活跃资源 4-活动状态
	 */
	public Integer getFiletype() {
		return filetype;
	}
	/**
	 * 设置：接收总文件数
	 */
	public void setTotalfilenum(Integer totalfilenum) {
		this.totalfilenum = totalfilenum;
	}
	/**
	 * 获取：接收总文件数
	 */
	public Integer getTotalfilenum() {
		return totalfilenum;
	}
	/**
	 * 设置：解析成功文件数
	 */
	public void setPraseoknum(Integer praseoknum) {
		this.praseoknum = praseoknum;
	}
	/**
	 * 获取：解析成功文件数
	 */
	public Integer getPraseoknum() {
		return praseoknum;
	}
	/**
	 * 设置：解析失败文件数
	 */
	public void setPrasefailnum(Integer prasefailnum) {
		this.prasefailnum = prasefailnum;
	}
	/**
	 * 获取：解析失败文件数
	 */
	public Integer getPrasefailnum() {
		return prasefailnum;
	}
	/**
	 * 设置：未解析文件数
	 */
	public void setNoprasenum(Integer noprasenum) {
		this.noprasenum = noprasenum;
	}
	/**
	 * 获取：未解析文件数
	 */
	public Integer getNoprasenum() {
		return noprasenum;
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
