package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monsys_all_tabname_info")
public class MonsysAllTabnameInfo {
    /**
     * 唯一用户ID
     */
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 表名
     */
    @Id
    @Column(name = "tableName")
    private String tablename;

    @Column(name = "idcID")
    private String idcid;

    @Column(name = "idcName")
    private String idcname;

    /**
     * 省份ID
     */
    @Column(name = "provId")
    private Integer provid;

    /**
     * 省份名称
     */
    @Column(name = "provName")
    private String provname;

    /**
     * 表类型代号
     */
    @Column(name = "tableType")
    private Integer tabletype;

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
     * 获取表名
     *
     * @return tableName - 表名
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * 设置表名
     *
     * @param tablename 表名
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
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
     * 获取省份名称
     *
     * @return provName - 省份名称
     */
    public String getProvname() {
        return provname;
    }

    /**
     * 设置省份名称
     *
     * @param provname 省份名称
     */
    public void setProvname(String provname) {
        this.provname = provname;
    }

    /**
     * 获取表类型代号
     *
     * @return tableType - 表类型代号
     */
    public Integer getTabletype() {
        return tabletype;
    }

    /**
     * 设置表类型代号
     *
     * @param tabletype 表类型代号
     */
    public void setTabletype(Integer tabletype) {
        this.tabletype = tabletype;
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