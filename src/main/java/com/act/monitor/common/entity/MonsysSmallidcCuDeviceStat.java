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
@Table(name = "monsys_smallidc_cu_device_stat")
public class MonsysSmallidcCuDeviceStat implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //CU内网IP地址
    @Column(name = "cuIP")
    private String cuip;
	
	    //1-web 2-inter 3-db
    @Column(name = "cuType")
    private Integer cutype;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //省份ID
    @Column(name = "provId")
    private Integer provid;
	
	    //idc名称
    @Column(name = "idcName")
    private String idcname;
	
	    //机房名称
    @Column(name = "houseName")
    private String housename;
	
	    //物理cup个数
    @Column(name = "physicalId")
    private Integer physicalid;
	
	    //逻辑cpu个数
    @Column(name = "logicId")
    private Integer logicid;
	
	    //CPU主频
    @Column(name = "cpuFrequcy")
    private Float cpufrequcy;
	
	    //CPU型号
    @Column(name = "cpuModel")
    private String cpumodel;
	
	    //总内存（单位：MB）
    @Column(name = "memoryTotal")
    private Long memorytotal;
	
	    //系统版本(电信，移动，联通，一体机)
    @Column(name = "carrier_operator")
    private String carrierOperator;
	
	    //版本信息
    @Column(name = "soft_version")
    private String softVersion;
	
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
	 * 设置：CU内网IP地址
	 */
	public void setCuip(String cuip) {
		this.cuip = cuip;
	}
	/**
	 * 获取：CU内网IP地址
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
	 * 设置：省份ID
	 */
	public void setProvid(Integer provid) {
		this.provid = provid;
	}
	/**
	 * 获取：省份ID
	 */
	public Integer getProvid() {
		return provid;
	}
	/**
	 * 设置：idc名称
	 */
	public void setIdcname(String idcname) {
		this.idcname = idcname;
	}
	/**
	 * 获取：idc名称
	 */
	public String getIdcname() {
		return idcname;
	}
	/**
	 * 设置：机房名称
	 */
	public void setHousename(String housename) {
		this.housename = housename;
	}
	/**
	 * 获取：机房名称
	 */
	public String getHousename() {
		return housename;
	}
	/**
	 * 设置：物理cup个数
	 */
	public void setPhysicalid(Integer physicalid) {
		this.physicalid = physicalid;
	}
	/**
	 * 获取：物理cup个数
	 */
	public Integer getPhysicalid() {
		return physicalid;
	}
	/**
	 * 设置：逻辑cpu个数
	 */
	public void setLogicid(Integer logicid) {
		this.logicid = logicid;
	}
	/**
	 * 获取：逻辑cpu个数
	 */
	public Integer getLogicid() {
		return logicid;
	}
	/**
	 * 设置：CPU主频
	 */
	public void setCpufrequcy(Float cpufrequcy) {
		this.cpufrequcy = cpufrequcy;
	}
	/**
	 * 获取：CPU主频
	 */
	public Float getCpufrequcy() {
		return cpufrequcy;
	}
	/**
	 * 设置：CPU型号
	 */
	public void setCpumodel(String cpumodel) {
		this.cpumodel = cpumodel;
	}
	/**
	 * 获取：CPU型号
	 */
	public String getCpumodel() {
		return cpumodel;
	}
	/**
	 * 设置：总内存（单位：MB）
	 */
	public void setMemorytotal(Long memorytotal) {
		this.memorytotal = memorytotal;
	}
	/**
	 * 获取：总内存（单位：MB）
	 */
	public Long getMemorytotal() {
		return memorytotal;
	}
	/**
	 * 设置：系统版本(电信，移动，联通，一体机)
	 */
	public void setCarrierOperator(String carrierOperator) {
		this.carrierOperator = carrierOperator;
	}
	/**
	 * 获取：系统版本(电信，移动，联通，一体机)
	 */
	public String getCarrierOperator() {
		return carrierOperator;
	}
	/**
	 * 设置：版本信息
	 */
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}
	/**
	 * 获取：版本信息
	 */
	public String getSoftVersion() {
		return softVersion;
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
