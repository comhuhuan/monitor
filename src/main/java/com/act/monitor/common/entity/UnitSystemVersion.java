package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 升级系统版本
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:40
 */
@Table(name = "unit_system_version")
public class UnitSystemVersion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //系统名称
    @Id
    private String name;
	
	    //系统版本
    @Column(name = "packet_type")
    private String packetType;
	
	    //
    @Column(name = "system_version")
    private String systemVersion;
	
	    //svn版本
    @Column(name = "svn_version")
    private String svnVersion;
	
	    //
    @Column(name = "desc")
    private String desc;
	
	    //
    @Column(name = "timestamp")
    private Date timestamp;
	

	/**
	 * 设置：系统名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：系统名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：系统版本
	 */
	public void setPacketType(String packetType) {
		this.packetType = packetType;
	}
	/**
	 * 获取：系统版本
	 */
	public String getPacketType() {
		return packetType;
	}
	/**
	 * 设置：
	 */
	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}
	/**
	 * 获取：
	 */
	public String getSystemVersion() {
		return systemVersion;
	}
	/**
	 * 设置：svn版本
	 */
	public void setSvnVersion(String svnVersion) {
		this.svnVersion = svnVersion;
	}
	/**
	 * 获取：svn版本
	 */
	public String getSvnVersion() {
		return svnVersion;
	}
	/**
	 * 设置：
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 获取：
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * 设置：
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * 获取：
	 */
	public Date getTimestamp() {
		return timestamp;
	}
}
