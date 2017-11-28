package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:53
 */
@Table(name = "monsys_smallidc_cu_memory_stat")
public class MonsysSmallidcCuMemoryStat implements Serializable {
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
	
	    //内存使用大小(单位MB)
    @Column(name = "memoryUsed")
    private Long memoryused;
	
	    //内存缓存大小(单位MB)
    @Column(name = "memoryBuffer")
    private Long memorybuffer;
	
	    //空闲内存大小(单位MB)
    @Column(name = "memoryFree")
    private Long memoryfree;
	
	    //内存使用率
    @Column(name = "memory_rate")
    private String memoryRate;
	
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
	 * 设置：内存使用大小(单位MB)
	 */
	public void setMemoryused(Long memoryused) {
		this.memoryused = memoryused;
	}
	/**
	 * 获取：内存使用大小(单位MB)
	 */
	public Long getMemoryused() {
		return memoryused;
	}
	/**
	 * 设置：内存缓存大小(单位MB)
	 */
	public void setMemorybuffer(Long memorybuffer) {
		this.memorybuffer = memorybuffer;
	}
	/**
	 * 获取：内存缓存大小(单位MB)
	 */
	public Long getMemorybuffer() {
		return memorybuffer;
	}
	/**
	 * 设置：空闲内存大小(单位MB)
	 */
	public void setMemoryfree(Long memoryfree) {
		this.memoryfree = memoryfree;
	}
	/**
	 * 获取：空闲内存大小(单位MB)
	 */
	public Long getMemoryfree() {
		return memoryfree;
	}
	/**
	 * 设置：内存使用率
	 */
	public void setMemoryRate(String memoryRate) {
		this.memoryRate = memoryRate;
	}
	/**
	 * 获取：内存使用率
	 */
	public String getMemoryRate() {
		return memoryRate;
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
