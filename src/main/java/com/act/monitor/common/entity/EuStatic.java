package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:52
 */
@Table(name = "eu_static")
public class EuStatic implements Serializable {
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
    @Column(name = "euIP")
    private String euip;
	
	    //
    @Column(name = "idcID")
    private String idcid;
	
	    //
    @Column(name = "provID")
    private Integer provid;
	
	    //
    @Column(name = "idcName")
    private String idcname;
	
	    //EU到CU通信状态 (1-异常，0-正常)
    @Column(name = "eu_cu_comm_stat")
    private Integer euCuCommStat;
	
	    //EU到CU通信状态当天是否发生异常(1-异常，0-正常)
    @Column(name = "eu_cu_comm_stat_his")
    private Integer euCuCommStatHis;
	
	    //设备状态(1-异常，0-正常)
    @Column(name = "device_stat")
    private Integer deviceStat;
	
	    //设备当天是否发生异常(1-异常，0-正常)
    @Column(name = "device_stat_his")
    private Integer deviceStatHis;
	
	    //进程状态(1-异常，0-正常)
    @Column(name = "process_stat")
    private Integer processStat;
	
	    //进程当天是否发生异常(1-异常，0-正常)
    @Column(name = "process_stat_his")
    private Integer processStatHis;
	
	    //CPU状态(1-异常，0-正常)
    @Column(name = "cpurate_stat")
    private Integer cpurateStat;
	
	    //CPU当天是否发生异常(1-异常，0-正常)
    @Column(name = "cpurate_stat_his")
    private Integer cpurateStatHis;
	
	    //磁盘状态(1-异常，0-正常)
    @Column(name = "disk_stat")
    private Integer diskStat;
	
	    //磁盘当天是否发生异常(1-异常，0-正常)
    @Column(name = "disk_stat_his")
    private Integer diskStatHis;
	
	    //内存状态(1-异常，0-正常)
    @Column(name = "memory_stat")
    private Integer memoryStat;
	
	    //内存当天是否发生异常(1-异常，0-正常)
    @Column(name = "memory_stat_his")
    private Integer memoryStatHis;
	
	    //运行状态(1-异常，0-正常)
    @Column(name = "runinfo_stat")
    private Integer runinfoStat;
	
	    //运行当天是否发生异常(1-异常，0-正常)
    @Column(name = "runinfo_stat_his")
    private Integer runinfoStatHis;
	
	    //EU到DU通信状态(1-异常，0-正常)
    @Column(name = "eu_du_comm_stat")
    private Integer euDuCommStat;
	
	    //EU到DU通信是否发生异常(1-异常，0-正常)
    @Column(name = "eu_du_comm_stat_his")
    private Integer euDuCommStatHis;
	
	    //链路状态(1-异常，0-正常)
    @Column(name = "link_stat")
    private Integer linkStat;
	
	    //链路当天是否发生异常(1-异常，0-正常)
    @Column(name = "link_stat_his")
    private Integer linkStatHis;
	
	    //网卡状态(1-异常，0-正常)
    @Column(name = "network_stat")
    private Integer networkStat;
	
	    //网卡当天是否发生异常(1-异常，0-正常)
    @Column(name = "network_stat_his")
    private Integer networkStatHis;
	
	    //备用栏
    @Column(name = "reserve0")
    private String reserve0;
	
	    //备用栏
    @Column(name = "reserve1")
    private String reserve1;
	
	    //EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
    @Column(name = "partial_stat")
    private Integer partialStat;
	
	    //EU机器状态(1-异常，0-正常)
    @Column(name = "status")
    private Integer status;
	
	    //EU机器状态(1-异常，0-正常)
    @Column(name = "status_his")
    private Integer statusHis;
	
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
	public void setEuip(String euip) {
		this.euip = euip;
	}
	/**
	 * 获取：
	 */
	public String getEuip() {
		return euip;
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
	public void setProvid(Integer provid) {
		this.provid = provid;
	}
	/**
	 * 获取：
	 */
	public Integer getProvid() {
		return provid;
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
	 * 设置：EU到CU通信状态 (1-异常，0-正常)
	 */
	public void setEuCuCommStat(Integer euCuCommStat) {
		this.euCuCommStat = euCuCommStat;
	}
	/**
	 * 获取：EU到CU通信状态 (1-异常，0-正常)
	 */
	public Integer getEuCuCommStat() {
		return euCuCommStat;
	}
	/**
	 * 设置：EU到CU通信状态当天是否发生异常(1-异常，0-正常)
	 */
	public void setEuCuCommStatHis(Integer euCuCommStatHis) {
		this.euCuCommStatHis = euCuCommStatHis;
	}
	/**
	 * 获取：EU到CU通信状态当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getEuCuCommStatHis() {
		return euCuCommStatHis;
	}
	/**
	 * 设置：设备状态(1-异常，0-正常)
	 */
	public void setDeviceStat(Integer deviceStat) {
		this.deviceStat = deviceStat;
	}
	/**
	 * 获取：设备状态(1-异常，0-正常)
	 */
	public Integer getDeviceStat() {
		return deviceStat;
	}
	/**
	 * 设置：设备当天是否发生异常(1-异常，0-正常)
	 */
	public void setDeviceStatHis(Integer deviceStatHis) {
		this.deviceStatHis = deviceStatHis;
	}
	/**
	 * 获取：设备当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getDeviceStatHis() {
		return deviceStatHis;
	}
	/**
	 * 设置：进程状态(1-异常，0-正常)
	 */
	public void setProcessStat(Integer processStat) {
		this.processStat = processStat;
	}
	/**
	 * 获取：进程状态(1-异常，0-正常)
	 */
	public Integer getProcessStat() {
		return processStat;
	}
	/**
	 * 设置：进程当天是否发生异常(1-异常，0-正常)
	 */
	public void setProcessStatHis(Integer processStatHis) {
		this.processStatHis = processStatHis;
	}
	/**
	 * 获取：进程当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getProcessStatHis() {
		return processStatHis;
	}
	/**
	 * 设置：CPU状态(1-异常，0-正常)
	 */
	public void setCpurateStat(Integer cpurateStat) {
		this.cpurateStat = cpurateStat;
	}
	/**
	 * 获取：CPU状态(1-异常，0-正常)
	 */
	public Integer getCpurateStat() {
		return cpurateStat;
	}
	/**
	 * 设置：CPU当天是否发生异常(1-异常，0-正常)
	 */
	public void setCpurateStatHis(Integer cpurateStatHis) {
		this.cpurateStatHis = cpurateStatHis;
	}
	/**
	 * 获取：CPU当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getCpurateStatHis() {
		return cpurateStatHis;
	}
	/**
	 * 设置：磁盘状态(1-异常，0-正常)
	 */
	public void setDiskStat(Integer diskStat) {
		this.diskStat = diskStat;
	}
	/**
	 * 获取：磁盘状态(1-异常，0-正常)
	 */
	public Integer getDiskStat() {
		return diskStat;
	}
	/**
	 * 设置：磁盘当天是否发生异常(1-异常，0-正常)
	 */
	public void setDiskStatHis(Integer diskStatHis) {
		this.diskStatHis = diskStatHis;
	}
	/**
	 * 获取：磁盘当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getDiskStatHis() {
		return diskStatHis;
	}
	/**
	 * 设置：内存状态(1-异常，0-正常)
	 */
	public void setMemoryStat(Integer memoryStat) {
		this.memoryStat = memoryStat;
	}
	/**
	 * 获取：内存状态(1-异常，0-正常)
	 */
	public Integer getMemoryStat() {
		return memoryStat;
	}
	/**
	 * 设置：内存当天是否发生异常(1-异常，0-正常)
	 */
	public void setMemoryStatHis(Integer memoryStatHis) {
		this.memoryStatHis = memoryStatHis;
	}
	/**
	 * 获取：内存当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getMemoryStatHis() {
		return memoryStatHis;
	}
	/**
	 * 设置：运行状态(1-异常，0-正常)
	 */
	public void setRuninfoStat(Integer runinfoStat) {
		this.runinfoStat = runinfoStat;
	}
	/**
	 * 获取：运行状态(1-异常，0-正常)
	 */
	public Integer getRuninfoStat() {
		return runinfoStat;
	}
	/**
	 * 设置：运行当天是否发生异常(1-异常，0-正常)
	 */
	public void setRuninfoStatHis(Integer runinfoStatHis) {
		this.runinfoStatHis = runinfoStatHis;
	}
	/**
	 * 获取：运行当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getRuninfoStatHis() {
		return runinfoStatHis;
	}
	/**
	 * 设置：EU到DU通信状态(1-异常，0-正常)
	 */
	public void setEuDuCommStat(Integer euDuCommStat) {
		this.euDuCommStat = euDuCommStat;
	}
	/**
	 * 获取：EU到DU通信状态(1-异常，0-正常)
	 */
	public Integer getEuDuCommStat() {
		return euDuCommStat;
	}
	/**
	 * 设置：EU到DU通信是否发生异常(1-异常，0-正常)
	 */
	public void setEuDuCommStatHis(Integer euDuCommStatHis) {
		this.euDuCommStatHis = euDuCommStatHis;
	}
	/**
	 * 获取：EU到DU通信是否发生异常(1-异常，0-正常)
	 */
	public Integer getEuDuCommStatHis() {
		return euDuCommStatHis;
	}
	/**
	 * 设置：链路状态(1-异常，0-正常)
	 */
	public void setLinkStat(Integer linkStat) {
		this.linkStat = linkStat;
	}
	/**
	 * 获取：链路状态(1-异常，0-正常)
	 */
	public Integer getLinkStat() {
		return linkStat;
	}
	/**
	 * 设置：链路当天是否发生异常(1-异常，0-正常)
	 */
	public void setLinkStatHis(Integer linkStatHis) {
		this.linkStatHis = linkStatHis;
	}
	/**
	 * 获取：链路当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getLinkStatHis() {
		return linkStatHis;
	}
	/**
	 * 设置：网卡状态(1-异常，0-正常)
	 */
	public void setNetworkStat(Integer networkStat) {
		this.networkStat = networkStat;
	}
	/**
	 * 获取：网卡状态(1-异常，0-正常)
	 */
	public Integer getNetworkStat() {
		return networkStat;
	}
	/**
	 * 设置：网卡当天是否发生异常(1-异常，0-正常)
	 */
	public void setNetworkStatHis(Integer networkStatHis) {
		this.networkStatHis = networkStatHis;
	}
	/**
	 * 获取：网卡当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getNetworkStatHis() {
		return networkStatHis;
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
	 * 设置：EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
	 */
	public void setPartialStat(Integer partialStat) {
		this.partialStat = partialStat;
	}
	/**
	 * 获取：EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
	 */
	public Integer getPartialStat() {
		return partialStat;
	}
	/**
	 * 设置：EU机器状态(1-异常，0-正常)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：EU机器状态(1-异常，0-正常)
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：EU机器状态(1-异常，0-正常)
	 */
	public void setStatusHis(Integer statusHis) {
		this.statusHis = statusHis;
	}
	/**
	 * 获取：EU机器状态(1-异常，0-正常)
	 */
	public Integer getStatusHis() {
		return statusHis;
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
