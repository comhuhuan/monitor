package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cu_static")
public class CuStatic {
    /**
     * 唯一用户ID
     */
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Id
    @Column(name = "cuIP")
    private String cuip;

    /**
     * 1-web 2-inter 3-db
     */
    @Column(name = "cuType")
    private Integer cutype;

    @Column(name = "idcID")
    private String idcid;

    @Column(name = "provID")
    private Integer provid;

    @Column(name = "idcName")
    private String idcname;

    /**
     * 设备状态(1-异常，0-正常)
     */
    @Column(name = "device_stat")
    private Integer deviceStat;

    /**
     * 设备当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "device_stat_his")
    private Integer deviceStatHis;

    /**
     * 进程状态(1-异常，0-正常)
     */
    @Column(name = "process_stat")
    private Integer processStat;

    /**
     * 进程当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "process_stat_his")
    private Integer processStatHis;

    /**
     * CPU状态(1-异常，0-正常)
     */
    @Column(name = "cpurate_stat")
    private Integer cpurateStat;

    /**
     * CPU当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "cpurate_stat_his")
    private Integer cpurateStatHis;

    /**
     * 磁盘状态(1-异常，0-正常)
     */
    @Column(name = "disk_stat")
    private Integer diskStat;

    /**
     * 磁盘当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "disk_stat_his")
    private Integer diskStatHis;

    /**
     * 内存状态(1-异常，0-正常)
     */
    @Column(name = "memory_stat")
    private Integer memoryStat;

    /**
     * 内存当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "memory_stat_his")
    private Integer memoryStatHis;

    /**
     * 运行状态(1-异常，0-正常)
     */
    @Column(name = "runinfo_stat")
    private Integer runinfoStat;

    /**
     * 运行当天是否发生异常(1-异常，0-正常
     */
    @Column(name = "runinfo_stat_his")
    private Integer runinfoStatHis;

    /**
     * 到管局通信状态(1-异常，0-正常)
     */
    @Column(name = "cu_smms_comm_stat")
    private Integer cuSmmsCommStat;

    /**
     * 到管局通信当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "cu_smms_comm_stat_his")
    private Integer cuSmmsCommStatHis;

    /**
     * CU到DU通信状态(1-异常，0-正常)
     */
    @Column(name = "cu_du_comm_stat")
    private Integer cuDuCommStat;

    /**
     * CU到DU通信状态当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "cu_du_comm_stat_his")
    private Integer cuDuCommStatHis;

    /**
     * 指令状态(1-异常，0-正常)
     */
    @Column(name = "cmd_stat")
    private Integer cmdStat;

    /**
     * 指令当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "cmd_stat_his")
    private Integer cmdStatHis;

    /**
     * 备用栏
     */
    private String reserve0;

    /**
     * 备用栏
     */
    private String reserve1;

    /**
     * EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
     */
    @Column(name = "partial_stat")
    private Integer partialStat;

    /**
     * 机器状态(1-异常，0-正常)
     */
    private Integer status;

    /**
     * 机器当天是否异常(1-异常，0-正常)
     */
    @Column(name = "status_his")
    private Integer statusHis;

    /**
     * 记录时间
     */
    @Column(name = "recordTime")
    private Date recordtime;

    /**
     * 获取唯一用户ID
     *
     * @return UUID - 唯一用户ID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置唯一用户ID
     *
     * @param uuid 唯一用户ID
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return cuIP
     */
    public String getCuip() {
        return cuip;
    }

    /**
     * @param cuip
     */
    public void setCuip(String cuip) {
        this.cuip = cuip;
    }

    /**
     * 获取1-web 2-inter 3-db
     *
     * @return cuType - 1-web 2-inter 3-db
     */
    public Integer getCutype() {
        return cutype;
    }

    /**
     * 设置1-web 2-inter 3-db
     *
     * @param cutype 1-web 2-inter 3-db
     */
    public void setCutype(Integer cutype) {
        this.cutype = cutype;
    }

    /**
     * @return idcID
     */
    public String getIdcid() {
        return idcid;
    }

    /**
     * @param idcid
     */
    public void setIdcid(String idcid) {
        this.idcid = idcid;
    }

    /**
     * @return provID
     */
    public Integer getProvid() {
        return provid;
    }

    /**
     * @param provid
     */
    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    /**
     * @return idcName
     */
    public String getIdcname() {
        return idcname;
    }

    /**
     * @param idcname
     */
    public void setIdcname(String idcname) {
        this.idcname = idcname;
    }

    /**
     * 获取设备状态(1-异常，0-正常)
     *
     * @return device_stat - 设备状态(1-异常，0-正常)
     */
    public Integer getDeviceStat() {
        return deviceStat;
    }

    /**
     * 设置设备状态(1-异常，0-正常)
     *
     * @param deviceStat 设备状态(1-异常，0-正常)
     */
    public void setDeviceStat(Integer deviceStat) {
        this.deviceStat = deviceStat;
    }

    /**
     * 获取设备当天是否发生异常(1-异常，0-正常)
     *
     * @return device_stat_his - 设备当天是否发生异常(1-异常，0-正常)
     */
    public Integer getDeviceStatHis() {
        return deviceStatHis;
    }

    /**
     * 设置设备当天是否发生异常(1-异常，0-正常)
     *
     * @param deviceStatHis 设备当天是否发生异常(1-异常，0-正常)
     */
    public void setDeviceStatHis(Integer deviceStatHis) {
        this.deviceStatHis = deviceStatHis;
    }

    /**
     * 获取进程状态(1-异常，0-正常)
     *
     * @return process_stat - 进程状态(1-异常，0-正常)
     */
    public Integer getProcessStat() {
        return processStat;
    }

    /**
     * 设置进程状态(1-异常，0-正常)
     *
     * @param processStat 进程状态(1-异常，0-正常)
     */
    public void setProcessStat(Integer processStat) {
        this.processStat = processStat;
    }

    /**
     * 获取进程当天是否发生异常(1-异常，0-正常)
     *
     * @return process_stat_his - 进程当天是否发生异常(1-异常，0-正常)
     */
    public Integer getProcessStatHis() {
        return processStatHis;
    }

    /**
     * 设置进程当天是否发生异常(1-异常，0-正常)
     *
     * @param processStatHis 进程当天是否发生异常(1-异常，0-正常)
     */
    public void setProcessStatHis(Integer processStatHis) {
        this.processStatHis = processStatHis;
    }

    /**
     * 获取CPU状态(1-异常，0-正常)
     *
     * @return cpurate_stat - CPU状态(1-异常，0-正常)
     */
    public Integer getCpurateStat() {
        return cpurateStat;
    }

    /**
     * 设置CPU状态(1-异常，0-正常)
     *
     * @param cpurateStat CPU状态(1-异常，0-正常)
     */
    public void setCpurateStat(Integer cpurateStat) {
        this.cpurateStat = cpurateStat;
    }

    /**
     * 获取CPU当天是否发生异常(1-异常，0-正常)
     *
     * @return cpurate_stat_his - CPU当天是否发生异常(1-异常，0-正常)
     */
    public Integer getCpurateStatHis() {
        return cpurateStatHis;
    }

    /**
     * 设置CPU当天是否发生异常(1-异常，0-正常)
     *
     * @param cpurateStatHis CPU当天是否发生异常(1-异常，0-正常)
     */
    public void setCpurateStatHis(Integer cpurateStatHis) {
        this.cpurateStatHis = cpurateStatHis;
    }

    /**
     * 获取磁盘状态(1-异常，0-正常)
     *
     * @return disk_stat - 磁盘状态(1-异常，0-正常)
     */
    public Integer getDiskStat() {
        return diskStat;
    }

    /**
     * 设置磁盘状态(1-异常，0-正常)
     *
     * @param diskStat 磁盘状态(1-异常，0-正常)
     */
    public void setDiskStat(Integer diskStat) {
        this.diskStat = diskStat;
    }

    /**
     * 获取磁盘当天是否发生异常(1-异常，0-正常)
     *
     * @return disk_stat_his - 磁盘当天是否发生异常(1-异常，0-正常)
     */
    public Integer getDiskStatHis() {
        return diskStatHis;
    }

    /**
     * 设置磁盘当天是否发生异常(1-异常，0-正常)
     *
     * @param diskStatHis 磁盘当天是否发生异常(1-异常，0-正常)
     */
    public void setDiskStatHis(Integer diskStatHis) {
        this.diskStatHis = diskStatHis;
    }

    /**
     * 获取内存状态(1-异常，0-正常)
     *
     * @return memory_stat - 内存状态(1-异常，0-正常)
     */
    public Integer getMemoryStat() {
        return memoryStat;
    }

    /**
     * 设置内存状态(1-异常，0-正常)
     *
     * @param memoryStat 内存状态(1-异常，0-正常)
     */
    public void setMemoryStat(Integer memoryStat) {
        this.memoryStat = memoryStat;
    }

    /**
     * 获取内存当天是否发生异常(1-异常，0-正常)
     *
     * @return memory_stat_his - 内存当天是否发生异常(1-异常，0-正常)
     */
    public Integer getMemoryStatHis() {
        return memoryStatHis;
    }

    /**
     * 设置内存当天是否发生异常(1-异常，0-正常)
     *
     * @param memoryStatHis 内存当天是否发生异常(1-异常，0-正常)
     */
    public void setMemoryStatHis(Integer memoryStatHis) {
        this.memoryStatHis = memoryStatHis;
    }

    /**
     * 获取运行状态(1-异常，0-正常)
     *
     * @return runinfo_stat - 运行状态(1-异常，0-正常)
     */
    public Integer getRuninfoStat() {
        return runinfoStat;
    }

    /**
     * 设置运行状态(1-异常，0-正常)
     *
     * @param runinfoStat 运行状态(1-异常，0-正常)
     */
    public void setRuninfoStat(Integer runinfoStat) {
        this.runinfoStat = runinfoStat;
    }

    /**
     * 获取运行当天是否发生异常(1-异常，0-正常
     *
     * @return runinfo_stat_his - 运行当天是否发生异常(1-异常，0-正常
     */
    public Integer getRuninfoStatHis() {
        return runinfoStatHis;
    }

    /**
     * 设置运行当天是否发生异常(1-异常，0-正常
     *
     * @param runinfoStatHis 运行当天是否发生异常(1-异常，0-正常
     */
    public void setRuninfoStatHis(Integer runinfoStatHis) {
        this.runinfoStatHis = runinfoStatHis;
    }

    /**
     * 获取到管局通信状态(1-异常，0-正常)
     *
     * @return cu_smms_comm_stat - 到管局通信状态(1-异常，0-正常)
     */
    public Integer getCuSmmsCommStat() {
        return cuSmmsCommStat;
    }

    /**
     * 设置到管局通信状态(1-异常，0-正常)
     *
     * @param cuSmmsCommStat 到管局通信状态(1-异常，0-正常)
     */
    public void setCuSmmsCommStat(Integer cuSmmsCommStat) {
        this.cuSmmsCommStat = cuSmmsCommStat;
    }

    /**
     * 获取到管局通信当天是否发生异常(1-异常，0-正常)
     *
     * @return cu_smms_comm_stat_his - 到管局通信当天是否发生异常(1-异常，0-正常)
     */
    public Integer getCuSmmsCommStatHis() {
        return cuSmmsCommStatHis;
    }

    /**
     * 设置到管局通信当天是否发生异常(1-异常，0-正常)
     *
     * @param cuSmmsCommStatHis 到管局通信当天是否发生异常(1-异常，0-正常)
     */
    public void setCuSmmsCommStatHis(Integer cuSmmsCommStatHis) {
        this.cuSmmsCommStatHis = cuSmmsCommStatHis;
    }

    /**
     * 获取CU到DU通信状态(1-异常，0-正常)
     *
     * @return cu_du_comm_stat - CU到DU通信状态(1-异常，0-正常)
     */
    public Integer getCuDuCommStat() {
        return cuDuCommStat;
    }

    /**
     * 设置CU到DU通信状态(1-异常，0-正常)
     *
     * @param cuDuCommStat CU到DU通信状态(1-异常，0-正常)
     */
    public void setCuDuCommStat(Integer cuDuCommStat) {
        this.cuDuCommStat = cuDuCommStat;
    }

    /**
     * 获取CU到DU通信状态当天是否发生异常(1-异常，0-正常)
     *
     * @return cu_du_comm_stat_his - CU到DU通信状态当天是否发生异常(1-异常，0-正常)
     */
    public Integer getCuDuCommStatHis() {
        return cuDuCommStatHis;
    }

    /**
     * 设置CU到DU通信状态当天是否发生异常(1-异常，0-正常)
     *
     * @param cuDuCommStatHis CU到DU通信状态当天是否发生异常(1-异常，0-正常)
     */
    public void setCuDuCommStatHis(Integer cuDuCommStatHis) {
        this.cuDuCommStatHis = cuDuCommStatHis;
    }

    /**
     * 获取指令状态(1-异常，0-正常)
     *
     * @return cmd_stat - 指令状态(1-异常，0-正常)
     */
    public Integer getCmdStat() {
        return cmdStat;
    }

    /**
     * 设置指令状态(1-异常，0-正常)
     *
     * @param cmdStat 指令状态(1-异常，0-正常)
     */
    public void setCmdStat(Integer cmdStat) {
        this.cmdStat = cmdStat;
    }

    /**
     * 获取指令当天是否发生异常(1-异常，0-正常)
     *
     * @return cmd_stat_his - 指令当天是否发生异常(1-异常，0-正常)
     */
    public Integer getCmdStatHis() {
        return cmdStatHis;
    }

    /**
     * 设置指令当天是否发生异常(1-异常，0-正常)
     *
     * @param cmdStatHis 指令当天是否发生异常(1-异常，0-正常)
     */
    public void setCmdStatHis(Integer cmdStatHis) {
        this.cmdStatHis = cmdStatHis;
    }

    /**
     * 获取备用栏
     *
     * @return reserve0 - 备用栏
     */
    public String getReserve0() {
        return reserve0;
    }

    /**
     * 设置备用栏
     *
     * @param reserve0 备用栏
     */
    public void setReserve0(String reserve0) {
        this.reserve0 = reserve0;
    }

    /**
     * 获取备用栏
     *
     * @return reserve1 - 备用栏
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * 设置备用栏
     *
     * @param reserve1 备用栏
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
     * 获取EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
     *
     * @return partial_stat - EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
     */
    public Integer getPartialStat() {
        return partialStat;
    }

    /**
     * 设置EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
     *
     * @param partialStat EU四元状态(内存,cpu, 磁盘,进程的综合状态 1-异常，0-正常)
     */
    public void setPartialStat(Integer partialStat) {
        this.partialStat = partialStat;
    }

    /**
     * 获取机器状态(1-异常，0-正常)
     *
     * @return status - 机器状态(1-异常，0-正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置机器状态(1-异常，0-正常)
     *
     * @param status 机器状态(1-异常，0-正常)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取机器当天是否异常(1-异常，0-正常)
     *
     * @return status_his - 机器当天是否异常(1-异常，0-正常)
     */
    public Integer getStatusHis() {
        return statusHis;
    }

    /**
     * 设置机器当天是否异常(1-异常，0-正常)
     *
     * @param statusHis 机器当天是否异常(1-异常，0-正常)
     */
    public void setStatusHis(Integer statusHis) {
        this.statusHis = statusHis;
    }

    /**
     * 获取记录时间
     *
     * @return recordTime - 记录时间
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * 设置记录时间
     *
     * @param recordtime 记录时间
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}