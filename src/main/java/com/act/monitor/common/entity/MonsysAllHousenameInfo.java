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
@Table(name = "monsys_all_housename_info")
public class MonsysAllHousenameInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String uuid;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //
    @Column(name = "houseID")
    private Long houseid;
	
	    //
    @Column(name = "houseName")
    private String housename;
	
	    //
    @Column(name = "reserve0")
    private String reserve0;
	
	    //
    @Column(name = "reserve1")
    private String reserve1;
	
	    //
    @Column(name = "reserve2")
    private String reserve2;
	
	    //
    @Column(name = "reserve3")
    private String reserve3;
	
	    //
    @Column(name = "recordTime")
    private Date recordtime;
	

	/**
	 * 设置：
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：
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
	public void setHousename(String housename) {
		this.housename = housename;
	}
	/**
	 * 获取：
	 */
	public String getHousename() {
		return housename;
	}
	/**
	 * 设置：
	 */
	public void setReserve0(String reserve0) {
		this.reserve0 = reserve0;
	}
	/**
	 * 获取：
	 */
	public String getReserve0() {
		return reserve0;
	}
	/**
	 * 设置：
	 */
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	/**
	 * 获取：
	 */
	public String getReserve1() {
		return reserve1;
	}
	/**
	 * 设置：
	 */
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	/**
	 * 获取：
	 */
	public String getReserve2() {
		return reserve2;
	}
	/**
	 * 设置：
	 */
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	/**
	 * 获取：
	 */
	public String getReserve3() {
		return reserve3;
	}
	/**
	 * 设置：
	 */
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	/**
	 * 获取：
	 */
	public Date getRecordtime() {
		return recordtime;
	}
}
