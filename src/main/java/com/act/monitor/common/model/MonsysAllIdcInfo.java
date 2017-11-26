package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monsys_all_idc_info")
public class MonsysAllIdcInfo {
    /**
     * 唯一用户ID
     */
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "idcID")
    private String idcid;

    /**
     * IDC运营商名称(例:湖北联通)
     */
    @Column(name = "idcName")
    private String idcname;

    /**
     * 省份ID
     */
    @Column(name = "provId")
    private Integer provid;

    /**
     * cu服务器总数
     */
    @Column(name = "cuDeviceNum")
    private Integer cudevicenum;

    /**
     * cu故障台数
     */
    @Column(name = "cuBadDeviceNum")
    private Integer cubaddevicenum;

    /**
     * EU服务器总数
     */
    @Column(name = "euDeviceNum")
    private Integer eudevicenum;

    /**
     * EU故障数
     */
    @Column(name = "euBadDeviceNum")
    private Integer eubaddevicenum;

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
     * 获取IDC运营商名称(例:湖北联通)
     *
     * @return idcName - IDC运营商名称(例:湖北联通)
     */
    public String getIdcname() {
        return idcname;
    }

    /**
     * 设置IDC运营商名称(例:湖北联通)
     *
     * @param idcname IDC运营商名称(例:湖北联通)
     */
    public void setIdcname(String idcname) {
        this.idcname = idcname;
    }

    /**
     * 获取省份ID
     *
     * @return provId - 省份ID
     */
    public Integer getProvid() {
        return provid;
    }

    /**
     * 设置省份ID
     *
     * @param provid 省份ID
     */
    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    /**
     * 获取cu服务器总数
     *
     * @return cuDeviceNum - cu服务器总数
     */
    public Integer getCudevicenum() {
        return cudevicenum;
    }

    /**
     * 设置cu服务器总数
     *
     * @param cudevicenum cu服务器总数
     */
    public void setCudevicenum(Integer cudevicenum) {
        this.cudevicenum = cudevicenum;
    }

    /**
     * 获取cu故障台数
     *
     * @return cuBadDeviceNum - cu故障台数
     */
    public Integer getCubaddevicenum() {
        return cubaddevicenum;
    }

    /**
     * 设置cu故障台数
     *
     * @param cubaddevicenum cu故障台数
     */
    public void setCubaddevicenum(Integer cubaddevicenum) {
        this.cubaddevicenum = cubaddevicenum;
    }

    /**
     * 获取EU服务器总数
     *
     * @return euDeviceNum - EU服务器总数
     */
    public Integer getEudevicenum() {
        return eudevicenum;
    }

    /**
     * 设置EU服务器总数
     *
     * @param eudevicenum EU服务器总数
     */
    public void setEudevicenum(Integer eudevicenum) {
        this.eudevicenum = eudevicenum;
    }

    /**
     * 获取EU故障数
     *
     * @return euBadDeviceNum - EU故障数
     */
    public Integer getEubaddevicenum() {
        return eubaddevicenum;
    }

    /**
     * 设置EU故障数
     *
     * @param eubaddevicenum EU故障数
     */
    public void setEubaddevicenum(Integer eubaddevicenum) {
        this.eubaddevicenum = eubaddevicenum;
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