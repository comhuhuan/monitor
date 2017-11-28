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
@Table(name = "monsys_smallidc_cu_stat_static")
public class MonsysSmallidcCuStatStatic implements Serializable {
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
	
	    //
    @Column(name = "provID")
    private Integer provid;
	
	    //
    @Column(name = "idcName")
    private String idcname;
	
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
	
	    //内存状态(1-异常，0-正常)
    @Column(name = "memory_stat")
    private Integer memoryStat;
	
	    //内存当天是否发生异常(1-异常，0-正常)
    @Column(name = "memory_stat_his")
    private Integer memoryStatHis;
	
	    //运行状态(1-异常，0-正常)
    @Column(name = "runinfo_stat")
    private Integer runinfoStat;
	
	    //运行当天是否发生异常(1-异常，0-正常
    @Column(name = "runinfo_stat_his")
    private Integer runinfoStatHis;
	
	    //到管局通信状态(1-异常，0-正常)
    @Column(name = "cu_smms_comm_stat")
    private Integer cuSmmsCommStat;
	
	    //到管局通信当天是否发生异常(1-异常，0-正常)
    @Column(name = "cu_smms_comm_stat_his")
    private Integer cuSmmsCommStatHis;
	
	    //磁盘状态(1-异常，0-正常)
    @Column(name = "disk_stat")
    private Integer diskStat;
	
	    //磁盘当天是否发生异常(1-异常，0-正常)
    @Column(name = "disk_stat_his")
    private Integer diskStatHis;
	
	    //指令状态(1-异常，0-正常)
    @Column(name = "cmd_stat")
    private Integer cmdStat;
	
	    //指令当天是否发生异常(1-异常，0-正常)
    @Column(name = "cmd_stat_his")
    private Integer cmdStatHis;
	
	    //CU到DU通信状态(1-异常，0-正常)
    @Column(name = "cu_du_comm_stat")
    private Integer cuDuCommStat;
	
	    //CU到DU通信状态当天是否发生异常(1-异常，0-正常)
    @Column(name = "cu_du_comm_stat_his")
    private Integer cuDuCommStatHis;
	
	    //备用栏
    @Column(name = "reserve0")
    private String reserve0;
	
	    //备用栏
    @Column(name = "reserve1")
    private String reserve1;
	
	    //机器状态(1-异常，0-正常)
    @Column(name = "status")
    private Integer status;
	
	    //机器当天是否异常(1-异常，0-正常)
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
	 * 设置：运行当天是否发生异常(1-异常，0-正常
	 */
	public void setRuninfoStatHis(Integer runinfoStatHis) {
		this.runinfoStatHis = runinfoStatHis;
	}
	/**
	 * 获取：运行当天是否发生异常(1-异常，0-正常
	 */
	public Integer getRuninfoStatHis() {
		return runinfoStatHis;
	}
	/**
	 * 设置：到管局通信状态(1-异常，0-正常)
	 */
	public void setCuSmmsCommStat(Integer cuSmmsCommStat) {
		this.cuSmmsCommStat = cuSmmsCommStat;
	}
	/**
	 * 获取：到管局通信状态(1-异常，0-正常)
	 */
	public Integer getCuSmmsCommStat() {
		return cuSmmsCommStat;
	}
	/**
	 * 设置：到管局通信当天是否发生异常(1-异常，0-正常)
	 */
	public void setCuSmmsCommStatHis(Integer cuSmmsCommStatHis) {
		this.cuSmmsCommStatHis = cuSmmsCommStatHis;
	}
	/**
	 * 获取：到管局通信当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getCuSmmsCommStatHis() {
		return cuSmmsCommStatHis;
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
	 * 设置：指令状态(1-异常，0-正常)
	 */
	public void setCmdStat(Integer cmdStat) {
		this.cmdStat = cmdStat;
	}
	/**
	 * 获取：指令状态(1-异常，0-正常)
	 */
	public Integer getCmdStat() {
		return cmdStat;
	}
	/**
	 * 设置：指令当天是否发生异常(1-异常，0-正常)
	 */
	public void setCmdStatHis(Integer cmdStatHis) {
		this.cmdStatHis = cmdStatHis;
	}
	/**
	 * 获取：指令当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getCmdStatHis() {
		return cmdStatHis;
	}
	/**
	 * 设置：CU到DU通信状态(1-异常，0-正常)
	 */
	public void setCuDuCommStat(Integer cuDuCommStat) {
		this.cuDuCommStat = cuDuCommStat;
	}
	/**
	 * 获取：CU到DU通信状态(1-异常，0-正常)
	 */
	public Integer getCuDuCommStat() {
		return cuDuCommStat;
	}
	/**
	 * 设置：CU到DU通信状态当天是否发生异常(1-异常，0-正常)
	 */
	public void setCuDuCommStatHis(Integer cuDuCommStatHis) {
		this.cuDuCommStatHis = cuDuCommStatHis;
	}
	/**
	 * 获取：CU到DU通信状态当天是否发生异常(1-异常，0-正常)
	 */
	public Integer getCuDuCommStatHis() {
		return cuDuCommStatHis;
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
	 * 设置：机器状态(1-异常，0-正常)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：机器状态(1-异常，0-正常)
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：机器当天是否异常(1-异常，0-正常)
	 */
	public void setStatusHis(Integer statusHis) {
		this.statusHis = statusHis;
	}
	/**
	 * 获取：机器当天是否异常(1-异常，0-正常)
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
