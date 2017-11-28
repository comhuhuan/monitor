package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:55
 */
@Table(name = "monsys_smallidc_eu_runinfo_stat")
public class MonsysSmallidcEuRuninfoStat implements Serializable {
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
	
	    //8080端口占用情况
    @Column(name = "8080occupation")
    private Integer 8080occupation;
	
	    //行为日志堆积数目
    @Column(name = "actlog_num")
    private Integer actlogNum;
	
	    //监测日志上报文件数
    @Column(name = "monitorLog_uploadNum")
    private Integer monitorlogUploadnum;
	
	    //封堵日志上报文件数
    @Column(name = "blockLog_uploadNum")
    private Integer blocklogUploadnum;
	
	    //活动状态上报文件数
    @Column(name = "statLog_uploadNum")
    private Integer statlogUploadnum;
	
	    //活跃资源上报文件数
    @Column(name = "resLog_uploadNum")
    private Integer reslogUploadnum;
	
	    //访问日志上报数 
    @Column(name = "actLog_uploadNum")
    private Integer actlogUploadnum;
	
	    //统计起始时间
    @Column(name = "startTime")
    private Date starttime;
	
	    //统计结束时间
    @Column(name = "endTime")
    private Date endtime;
	
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
	 * 设置：8080端口占用情况
	 */
	public void set8080occupation(Integer 8080occupation) {
		this.8080occupation = 8080occupation;
	}
	/**
	 * 获取：8080端口占用情况
	 */
	public Integer get8080occupation() {
		return 8080occupation;
	}
	/**
	 * 设置：行为日志堆积数目
	 */
	public void setActlogNum(Integer actlogNum) {
		this.actlogNum = actlogNum;
	}
	/**
	 * 获取：行为日志堆积数目
	 */
	public Integer getActlogNum() {
		return actlogNum;
	}
	/**
	 * 设置：监测日志上报文件数
	 */
	public void setMonitorlogUploadnum(Integer monitorlogUploadnum) {
		this.monitorlogUploadnum = monitorlogUploadnum;
	}
	/**
	 * 获取：监测日志上报文件数
	 */
	public Integer getMonitorlogUploadnum() {
		return monitorlogUploadnum;
	}
	/**
	 * 设置：封堵日志上报文件数
	 */
	public void setBlocklogUploadnum(Integer blocklogUploadnum) {
		this.blocklogUploadnum = blocklogUploadnum;
	}
	/**
	 * 获取：封堵日志上报文件数
	 */
	public Integer getBlocklogUploadnum() {
		return blocklogUploadnum;
	}
	/**
	 * 设置：活动状态上报文件数
	 */
	public void setStatlogUploadnum(Integer statlogUploadnum) {
		this.statlogUploadnum = statlogUploadnum;
	}
	/**
	 * 获取：活动状态上报文件数
	 */
	public Integer getStatlogUploadnum() {
		return statlogUploadnum;
	}
	/**
	 * 设置：活跃资源上报文件数
	 */
	public void setReslogUploadnum(Integer reslogUploadnum) {
		this.reslogUploadnum = reslogUploadnum;
	}
	/**
	 * 获取：活跃资源上报文件数
	 */
	public Integer getReslogUploadnum() {
		return reslogUploadnum;
	}
	/**
	 * 设置：访问日志上报数 
	 */
	public void setActlogUploadnum(Integer actlogUploadnum) {
		this.actlogUploadnum = actlogUploadnum;
	}
	/**
	 * 获取：访问日志上报数 
	 */
	public Integer getActlogUploadnum() {
		return actlogUploadnum;
	}
	/**
	 * 设置：统计起始时间
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	/**
	 * 获取：统计起始时间
	 */
	public Date getStarttime() {
		return starttime;
	}
	/**
	 * 设置：统计结束时间
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	/**
	 * 获取：统计结束时间
	 */
	public Date getEndtime() {
		return endtime;
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
