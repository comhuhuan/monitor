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
@Table(name = "monsys_smallidc_cu_cmd_stat")
public class MonsysSmallidcCuCmdStat implements Serializable {
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
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //1-CU到EU 2-管局到CU
    @Column(name = "cmdType")
    private Integer cmdtype;
	
	    //指令总数
    @Column(name = "cmdTotalNum")
    private Integer cmdtotalnum;
	
	    //成功指令数
    @Column(name = "cmdSucessNum")
    private Integer cmdsucessnum;
	
	    //插入数据具体天(例如20170608)
    @Column(name = "day")
    private String day;
	
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
	 * 设置：
	 */
	public void setIdcid(String idcid) {
		this.idcid = idcid;
	}
	/**
	 * 获取：
	 */
	public String getIdcid() {
		return idcid;
	}
	/**
	 * 设置：1-CU到EU 2-管局到CU
	 */
	public void setCmdtype(Integer cmdtype) {
		this.cmdtype = cmdtype;
	}
	/**
	 * 获取：1-CU到EU 2-管局到CU
	 */
	public Integer getCmdtype() {
		return cmdtype;
	}
	/**
	 * 设置：指令总数
	 */
	public void setCmdtotalnum(Integer cmdtotalnum) {
		this.cmdtotalnum = cmdtotalnum;
	}
	/**
	 * 获取：指令总数
	 */
	public Integer getCmdtotalnum() {
		return cmdtotalnum;
	}
	/**
	 * 设置：成功指令数
	 */
	public void setCmdsucessnum(Integer cmdsucessnum) {
		this.cmdsucessnum = cmdsucessnum;
	}
	/**
	 * 获取：成功指令数
	 */
	public Integer getCmdsucessnum() {
		return cmdsucessnum;
	}
	/**
	 * 设置：插入数据具体天(例如20170608)
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 获取：插入数据具体天(例如20170608)
	 */
	public String getDay() {
		return day;
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
