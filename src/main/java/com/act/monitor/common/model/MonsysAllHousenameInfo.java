package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monsys_all_housename_info")
public class MonsysAllHousenameInfo {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Id
    @Column(name = "houseID")
    private Long houseid;

    @Column(name = "idcID")
    private String idcid;

    @Column(name = "houseName")
    private String housename;

    private String reserve0;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    @Column(name = "recordTime")
    private Date recordtime;

    /**
     * @return UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
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
     * @return houseName
     */
    public String getHousename() {
        return housename;
    }

    /**
     * @param housename
     */
    public void setHousename(String housename) {
        this.housename = housename;
    }

    /**
     * @return reserve0
     */
    public String getReserve0() {
        return reserve0;
    }

    /**
     * @param reserve0
     */
    public void setReserve0(String reserve0) {
        this.reserve0 = reserve0;
    }

    /**
     * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * @param reserve1
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
     * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * @param reserve2
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
     * @return reserve3
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * @param reserve3
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
     * @return recordTime
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * @param recordtime
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}