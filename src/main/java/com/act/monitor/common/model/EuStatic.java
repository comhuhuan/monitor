package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "eu_static")
public class EuStatic {
    /**
     * 唯一用户ID
     */
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Id
    @Column(name = "houseID")
    private Long houseid;

    @Id
    @Column(name = "euID")
    private String euid;

    @Column(name = "euIP")
    private String euip;

    @Column(name = "idcID")
    private String idcid;

    @Column(name = "provID")
    private Integer provid;

    @Column(name = "idcName")
    private String idcname;

    /**
     * EU到CU通信状态 (1-异常，0-正常)
     */
    @Column(name = "eu_cu_comm_stat")
    private Integer euCuCommStat;

    /**
     * EU到CU通信状态当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "eu_cu_comm_stat_his")
    private Integer euCuCommStatHis;

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
     * 运行当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "runinfo_stat_his")
    private Integer runinfoStatHis;

    /**
     * EU到DU通信状态(1-异常，0-正常)
     */
    @Column(name = "eu_du_comm_stat")
    private Integer euDuCommStat;

    /**
     * EU到DU通信是否发生异常(1-异常，0-正常)
     */
    @Column(name = "eu_du_comm_stat_his")
    private Integer euDuCommStatHis;

    /**
     * 链路状态(1-异常，0-正常)
     */
    @Column(name = "link_stat")
    private Integer linkStat;

    /**
     * 链路当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "link_stat_his")
    private Integer linkStatHis;

    /**
     * 网卡状态(1-异常，0-正常)
     */
    @Column(name = "network_stat")
    private Integer networkStat;

    /**
     * 网卡当天是否发生异常(1-异常，0-正常)
     */
    @Column(name = "network_stat_his")
    private Integer networkStatHis;

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
     * EU机器状态(1-异常，0-正常)
     */
    private Integer status;

    /**
     * EU机器状态(1-异常，0-正常)
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
     * @return houseID
     */
    public Long getHouseid() {
        return houseid;
    }

    /**
     * @param houseid
     */
    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    /**
     * @return euID
     */
    public String getEuid() {
        return euid;
    }

    /**
     * @param euid
     */
    public void setEuid(String euid) {
        this.euid = euid;
    }

    /**
     * @return euIP
     */
    public String getEuip() {
        return euip;
    }

    /**
     * @param euip
     */
    public void setEuip(String euip) {
        this.euip = euip;
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
     * 获取EU到CU通信状态 (1-异常，0-正常)
     *
     * @return eu_cu_comm_stat - EU到CU通信状态 (1-异常，0-正常)
     */
    public Integer getEuCuCommStat() {
        return euCuCommStat;
    }

    /**
     * 设置EU到CU通信状态 (1-异常，0-正常)
     *
     * @param euCuCommStat EU到CU通信状态 (1-异常，0-正常)
     */
    public void setEuCuCommStat(Integer euCuCommStat) {
        this.euCuCommStat = euCuCommStat;
    }

    /**
     * 获取EU到CU通信状态当天是否发生异常(1-异常，0-正常)
     *
     * @return eu_cu_comm_stat_his - EU到CU通信状态当天是否发生异常(1-异常，0-正常)
     */
    public Integer getEuCuCommStatHis() {
        return euCuCommStatHis;
    }

    /**
     * 设置EU到CU通信状态当天是否发生异常(1-异常，0-正常)
     *
     * @param euCuCommStatHis EU到CU通信状态当天是否发生异常(1-异常，0-正常)
     */
    public void setEuCuCommStatHis(Integer euCuCommStatHis) {
        this.euCuCommStatHis = euCuCommStatHis;
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
     * 获取运行当天是否发生异常(1-异常，0-正常)
     *
     * @return runinfo_stat_his - 运行当天是否发生异常(1-异常，0-正常)
     */
    public Integer getRuninfoStatHis() {
        return runinfoStatHis;
    }

    /**
     * 设置运行当天是否发生异常(1-异常，0-正常)
     *
     * @param runinfoStatHis 运行当天是否发生异常(1-异常，0-正常)
     */
    public void setRuninfoStatHis(Integer runinfoStatHis) {
        this.runinfoStatHis = runinfoStatHis;
    }

    /**
     * 获取EU到DU通信状态(1-异常，0-正常)
     *
     * @return eu_du_comm_stat - EU到DU通信状态(1-异常，0-正常)
     */
    public Integer getEuDuCommStat() {
        return euDuCommStat;
    }

    /**
     * 设置EU到DU通信状态(1-异常，0-正常)
     *
     * @param euDuCommStat EU到DU通信状态(1-异常，0-正常)
     */
    public void setEuDuCommStat(Integer euDuCommStat) {
        this.euDuCommStat = euDuCommStat;
    }

    /**
     * 获取EU到DU通信是否发生异常(1-异常，0-正常)
     *
     * @return eu_du_comm_stat_his - EU到DU通信是否发生异常(1-异常，0-正常)
     */
    public Integer getEuDuCommStatHis() {
        return euDuCommStatHis;
    }

    /**
     * 设置EU到DU通信是否发生异常(1-异常，0-正常)
     *
     * @param euDuCommStatHis EU到DU通信是否发生异常(1-异常，0-正常)
     */
    public void setEuDuCommStatHis(Integer euDuCommStatHis) {
        this.euDuCommStatHis = euDuCommStatHis;
    }

    /**
     * 获取链路状态(1-异常，0-正常)
     *
     * @return link_stat - 链路状态(1-异常，0-正常)
     */
    public Integer getLinkStat() {
        return linkStat;
    }

    /**
     * 设置链路状态(1-异常，0-正常)
     *
     * @param linkStat 链路状态(1-异常，0-正常)
     */
    public void setLinkStat(Integer linkStat) {
        this.linkStat = linkStat;
    }

    /**
     * 获取链路当天是否发生异常(1-异常，0-正常)
     *
     * @return link_stat_his - 链路当天是否发生异常(1-异常，0-正常)
     */
    public Integer getLinkStatHis() {
        return linkStatHis;
    }

    /**
     * 设置链路当天是否发生异常(1-异常，0-正常)
     *
     * @param linkStatHis 链路当天是否发生异常(1-异常，0-正常)
     */
    public void setLinkStatHis(Integer linkStatHis) {
        this.linkStatHis = linkStatHis;
    }

    /**
     * 获取网卡状态(1-异常，0-正常)
     *
     * @return network_stat - 网卡状态(1-异常，0-正常)
     */
    public Integer getNetworkStat() {
        return networkStat;
    }

    /**
     * 设置网卡状态(1-异常，0-正常)
     *
     * @param networkStat 网卡状态(1-异常，0-正常)
     */
    public void setNetworkStat(Integer networkStat) {
        this.networkStat = networkStat;
    }

    /**
     * 获取网卡当天是否发生异常(1-异常，0-正常)
     *
     * @return network_stat_his - 网卡当天是否发生异常(1-异常，0-正常)
     */
    public Integer getNetworkStatHis() {
        return networkStatHis;
    }

    /**
     * 设置网卡当天是否发生异常(1-异常，0-正常)
     *
     * @param networkStatHis 网卡当天是否发生异常(1-异常，0-正常)
     */
    public void setNetworkStatHis(Integer networkStatHis) {
        this.networkStatHis = networkStatHis;
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
     * 获取EU机器状态(1-异常，0-正常)
     *
     * @return status - EU机器状态(1-异常，0-正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置EU机器状态(1-异常，0-正常)
     *
     * @param status EU机器状态(1-异常，0-正常)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取EU机器状态(1-异常，0-正常)
     *
     * @return status_his - EU机器状态(1-异常，0-正常)
     */
    public Integer getStatusHis() {
        return statusHis;
    }

    /**
     * 设置EU机器状态(1-异常，0-正常)
     *
     * @param statusHis EU机器状态(1-异常，0-正常)
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