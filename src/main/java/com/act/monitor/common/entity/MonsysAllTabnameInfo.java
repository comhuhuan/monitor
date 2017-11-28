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
@Table(name = "monsys_all_tabname_info")
public class MonsysAllTabnameInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //
    @Column(name = "idcName")
    private String idcname;
	
	    //省份ID
    @Column(name = "provId")
    private Integer provid;
	
	    //省份名称
    @Column(name = "provName")
    private String provname;
	
	    //表名
    @Column(name = "tableName")
    private String tablename;
	
	    //表类型代号
    @Column(name = "tableType")
    private Integer tabletype;
	
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
	 * 设置：
	 */
	public void setIdcname(String idcname) {
		this.idcname = idcname;
	}
	/**
	 * 获取：
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
	 * 设置：省份名称
	 */
	public void setProvname(String provname) {
		this.provname = provname;
	}
	/**
	 * 获取：省份名称
	 */
	public String getProvname() {
		return provname;
	}
	/**
	 * 设置：表名
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	/**
	 * 获取：表名
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * 设置：表类型代号
	 */
	public void setTabletype(Integer tabletype) {
		this.tabletype = tabletype;
	}
	/**
	 * 获取：表类型代号
	 */
	public Integer getTabletype() {
		return tabletype;
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
