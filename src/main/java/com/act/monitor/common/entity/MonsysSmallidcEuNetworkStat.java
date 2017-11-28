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
@Table(name = "monsys_smallidc_eu_network_stat")
public class MonsysSmallidcEuNetworkStat implements Serializable {
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
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //网卡mac地址
    @Column(name = "mac")
    private String mac;
	
	    //网卡名称
    @Column(name = "cardName")
    private String cardname;
	
	    //网卡作用(1,捕包网卡,2,其他网卡)
    @Column(name = "cardFunction")
    private Integer cardfunction;
	
	    //1-光口 2-电口 3-其他
    @Column(name = "cardepType")
    private Integer cardeptype;
	
	    //网卡类型（百兆/千兆）
    @Column(name = "cardType")
    private Integer cardtype;
	
	    //单位Mb/s
    @Column(name = "transmissionSpeed")
    private Float transmissionspeed;
	
	    //单位个/s
    @Column(name = "pps")
    private Float pps;
	
	    //单位Mb/s
    @Column(name = "bps")
    private Float bps;
	
	    //丢包率
    @Column(name = "PLP")
    private Float plp;
	
	    //连接状态(yes/no)
    @Column(name = "connStatus")
    private String connstatus;
	
	    //混杂模式(1表示混战模式/0 表示非混杂模式)
    @Column(name = "hybridModel")
    private Integer hybridmodel;
	
	    //网卡型号信息
    @Column(name = "netCardInfo")
    private String netcardinfo;
	
	    //网卡IP
    @Column(name = "innerIp")
    private String innerip;
	
	    //版本信息
    @Column(name = "version")
    private String version;
	
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
	 * 设置：网卡mac地址
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	/**
	 * 获取：网卡mac地址
	 */
	public String getMac() {
		return mac;
	}
	/**
	 * 设置：网卡名称
	 */
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	/**
	 * 获取：网卡名称
	 */
	public String getCardname() {
		return cardname;
	}
	/**
	 * 设置：网卡作用(1,捕包网卡,2,其他网卡)
	 */
	public void setCardfunction(Integer cardfunction) {
		this.cardfunction = cardfunction;
	}
	/**
	 * 获取：网卡作用(1,捕包网卡,2,其他网卡)
	 */
	public Integer getCardfunction() {
		return cardfunction;
	}
	/**
	 * 设置：1-光口 2-电口 3-其他
	 */
	public void setCardeptype(Integer cardeptype) {
		this.cardeptype = cardeptype;
	}
	/**
	 * 获取：1-光口 2-电口 3-其他
	 */
	public Integer getCardeptype() {
		return cardeptype;
	}
	/**
	 * 设置：网卡类型（百兆/千兆）
	 */
	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}
	/**
	 * 获取：网卡类型（百兆/千兆）
	 */
	public Integer getCardtype() {
		return cardtype;
	}
	/**
	 * 设置：单位Mb/s
	 */
	public void setTransmissionspeed(Float transmissionspeed) {
		this.transmissionspeed = transmissionspeed;
	}
	/**
	 * 获取：单位Mb/s
	 */
	public Float getTransmissionspeed() {
		return transmissionspeed;
	}
	/**
	 * 设置：单位个/s
	 */
	public void setPps(Float pps) {
		this.pps = pps;
	}
	/**
	 * 获取：单位个/s
	 */
	public Float getPps() {
		return pps;
	}
	/**
	 * 设置：单位Mb/s
	 */
	public void setBps(Float bps) {
		this.bps = bps;
	}
	/**
	 * 获取：单位Mb/s
	 */
	public Float getBps() {
		return bps;
	}
	/**
	 * 设置：丢包率
	 */
	public void setPlp(Float plp) {
		this.plp = plp;
	}
	/**
	 * 获取：丢包率
	 */
	public Float getPlp() {
		return plp;
	}
	/**
	 * 设置：连接状态(yes/no)
	 */
	public void setConnstatus(String connstatus) {
		this.connstatus = connstatus;
	}
	/**
	 * 获取：连接状态(yes/no)
	 */
	public String getConnstatus() {
		return connstatus;
	}
	/**
	 * 设置：混杂模式(1表示混战模式/0 表示非混杂模式)
	 */
	public void setHybridmodel(Integer hybridmodel) {
		this.hybridmodel = hybridmodel;
	}
	/**
	 * 获取：混杂模式(1表示混战模式/0 表示非混杂模式)
	 */
	public Integer getHybridmodel() {
		return hybridmodel;
	}
	/**
	 * 设置：网卡型号信息
	 */
	public void setNetcardinfo(String netcardinfo) {
		this.netcardinfo = netcardinfo;
	}
	/**
	 * 获取：网卡型号信息
	 */
	public String getNetcardinfo() {
		return netcardinfo;
	}
	/**
	 * 设置：网卡IP
	 */
	public void setInnerip(String innerip) {
		this.innerip = innerip;
	}
	/**
	 * 获取：网卡IP
	 */
	public String getInnerip() {
		return innerip;
	}
	/**
	 * 设置：版本信息
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * 获取：版本信息
	 */
	public String getVersion() {
		return version;
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
