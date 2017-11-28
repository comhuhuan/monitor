package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:42
 */
@Table(name = "monsys_all_idc_info")
public class MonsysAllIdcInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //IDC运营商名称(例:湖北联通)
    @Column(name = "idcName")
    private String idcname;
	
	    //省份ID
    @Column(name = "provId")
    private Integer provid;
	
	    //cu服务器总数
    @Column(name = "cuDeviceNum")
    private Integer cudevicenum;
	
	    //cu故障台数
    @Column(name = "cuBadDeviceNum")
    private Integer cubaddevicenum;
	
	    //EU服务器总数
    @Column(name = "euDeviceNum")
    private Integer eudevicenum;
	
	    //EU故障数
    @Column(name = "euBadDeviceNum")
    private Integer eubaddevicenum;
	
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
	 * 设置：IDC运营商名称(例:湖北联通)
	 */
	public void setIdcname(String idcname) {
		this.idcname = idcname;
	}
	/**
	 * 获取：IDC运营商名称(例:湖北联通)
	 */
	public String getIdcname() {
		return idcname;
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
	 * 设置：cu服务器总数
	 */
	public void setCudevicenum(Integer cudevicenum) {
		this.cudevicenum = cudevicenum;
	}
	/**
	 * 获取：cu服务器总数
	 */
	public Integer getCudevicenum() {
		return cudevicenum;
	}
	/**
	 * 设置：cu故障台数
	 */
	public void setCubaddevicenum(Integer cubaddevicenum) {
		this.cubaddevicenum = cubaddevicenum;
	}
	/**
	 * 获取：cu故障台数
	 */
	public Integer getCubaddevicenum() {
		return cubaddevicenum;
	}
	/**
	 * 设置：EU服务器总数
	 */
	public void setEudevicenum(Integer eudevicenum) {
		this.eudevicenum = eudevicenum;
	}
	/**
	 * 获取：EU服务器总数
	 */
	public Integer getEudevicenum() {
		return eudevicenum;
	}
	/**
	 * 设置：EU故障数
	 */
	public void setEubaddevicenum(Integer eubaddevicenum) {
		this.eubaddevicenum = eubaddevicenum;
	}
	/**
	 * 获取：EU故障数
	 */
	public Integer getEubaddevicenum() {
		return eubaddevicenum;
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
