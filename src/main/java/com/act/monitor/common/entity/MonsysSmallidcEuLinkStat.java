package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:53
 */
@Table(name = "monsys_smallidc_eu_link_stat")
public class MonsysSmallidcEuLinkStat implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "houseID")
    private Long houseid;
	
	    //节点ID，在本机房中唯一
    @Column(name = "euID")
    private String euid;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //节点的类型，1-EU，2-DPI，3-接口设备,4-其他
    @Column(name = "spotType")
    private Integer spottype;
	
	    //节点的IP
    @Column(name = "spotIP")
    private String spotip;
	
	    //异常类型：0——正常运行1——程序异常2——设备故障（如：宕机）
    @Column(name = "abnormal")
    private Integer abnormal;
	
	    //节点异常描述
    @Column(name = "spotMsg")
    private String spotmsg;
	
	    //链路ID，在本机房中唯一
    @Column(name = "linkID")
    private String linkid;
	
	    //进口流量（单位：Mbps）
    @Column(name = "inflow")
    private Integer inflow;
	
	    //出口流量（单位：Mbps）
    @Column(name = "outflow")
    private Integer outflow;
	
	    //前一天进口总流量（单位：Gbps），每天上报一次，上报前一天总流量
    @Column(name = "intFlowTotal")
    private Integer intflowtotal;
	
	    //前一天出口总流量（单位：Gbps），每天上报一次，上报前一天总流量
    @Column(name = "outFlowTotal")
    private Integer outflowtotal;
	
	    //链路接入方式：1——分光2——镜像
    @Column(name = "linkType")
    private Integer linktype;
	
	    //链路状态：0——串接1——并接2——故障（如：bypass）
    @Column(name = "linkState")
    private Integer linkstate;
	
	    //故障描述
    @Column(name = "linkMsg")
    private String linkmsg;
	
	    //
    @Column(name = "reserve0")
    private String reserve0;
	
	    //
    @Column(name = "reserve1")
    private String reserve1;
	
	    //是否异常：1-异常  0-正常
    @Column(name = "status")
    private Integer status;
	
	    //记录时间
    @Column(name = "recordTime")
    private String recordtime;
	

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
	 * 设置：节点ID，在本机房中唯一
	 */
	public void setEuid(String euid) {
		this.euid = euid;
	}
	/**
	 * 获取：节点ID，在本机房中唯一
	 */
	public String getEuid() {
		return euid;
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
	 * 设置：节点的类型，1-EU，2-DPI，3-接口设备,4-其他
	 */
	public void setSpottype(Integer spottype) {
		this.spottype = spottype;
	}
	/**
	 * 获取：节点的类型，1-EU，2-DPI，3-接口设备,4-其他
	 */
	public Integer getSpottype() {
		return spottype;
	}
	/**
	 * 设置：节点的IP
	 */
	public void setSpotip(String spotip) {
		this.spotip = spotip;
	}
	/**
	 * 获取：节点的IP
	 */
	public String getSpotip() {
		return spotip;
	}
	/**
	 * 设置：异常类型：0——正常运行1——程序异常2——设备故障（如：宕机）
	 */
	public void setAbnormal(Integer abnormal) {
		this.abnormal = abnormal;
	}
	/**
	 * 获取：异常类型：0——正常运行1——程序异常2——设备故障（如：宕机）
	 */
	public Integer getAbnormal() {
		return abnormal;
	}
	/**
	 * 设置：节点异常描述
	 */
	public void setSpotmsg(String spotmsg) {
		this.spotmsg = spotmsg;
	}
	/**
	 * 获取：节点异常描述
	 */
	public String getSpotmsg() {
		return spotmsg;
	}
	/**
	 * 设置：链路ID，在本机房中唯一
	 */
	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}
	/**
	 * 获取：链路ID，在本机房中唯一
	 */
	public String getLinkid() {
		return linkid;
	}
	/**
	 * 设置：进口流量（单位：Mbps）
	 */
	public void setInflow(Integer inflow) {
		this.inflow = inflow;
	}
	/**
	 * 获取：进口流量（单位：Mbps）
	 */
	public Integer getInflow() {
		return inflow;
	}
	/**
	 * 设置：出口流量（单位：Mbps）
	 */
	public void setOutflow(Integer outflow) {
		this.outflow = outflow;
	}
	/**
	 * 获取：出口流量（单位：Mbps）
	 */
	public Integer getOutflow() {
		return outflow;
	}
	/**
	 * 设置：前一天进口总流量（单位：Gbps），每天上报一次，上报前一天总流量
	 */
	public void setIntflowtotal(Integer intflowtotal) {
		this.intflowtotal = intflowtotal;
	}
	/**
	 * 获取：前一天进口总流量（单位：Gbps），每天上报一次，上报前一天总流量
	 */
	public Integer getIntflowtotal() {
		return intflowtotal;
	}
	/**
	 * 设置：前一天出口总流量（单位：Gbps），每天上报一次，上报前一天总流量
	 */
	public void setOutflowtotal(Integer outflowtotal) {
		this.outflowtotal = outflowtotal;
	}
	/**
	 * 获取：前一天出口总流量（单位：Gbps），每天上报一次，上报前一天总流量
	 */
	public Integer getOutflowtotal() {
		return outflowtotal;
	}
	/**
	 * 设置：链路接入方式：1——分光2——镜像
	 */
	public void setLinktype(Integer linktype) {
		this.linktype = linktype;
	}
	/**
	 * 获取：链路接入方式：1——分光2——镜像
	 */
	public Integer getLinktype() {
		return linktype;
	}
	/**
	 * 设置：链路状态：0——串接1——并接2——故障（如：bypass）
	 */
	public void setLinkstate(Integer linkstate) {
		this.linkstate = linkstate;
	}
	/**
	 * 获取：链路状态：0——串接1——并接2——故障（如：bypass）
	 */
	public Integer getLinkstate() {
		return linkstate;
	}
	/**
	 * 设置：故障描述
	 */
	public void setLinkmsg(String linkmsg) {
		this.linkmsg = linkmsg;
	}
	/**
	 * 获取：故障描述
	 */
	public String getLinkmsg() {
		return linkmsg;
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
	public void setRecordtime(String recordtime) {
		this.recordtime = recordtime;
	}
	/**
	 * 获取：记录时间
	 */
	public String getRecordtime() {
		return recordtime;
	}
}
