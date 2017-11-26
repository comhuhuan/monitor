package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "td_province")
public class TdProvince {
    @Id
    @Column(name = "PROV_ID")
    private Long provId;

    @Column(name = "PROV_NAME")
    private String provName;

    @Column(name = "PROV_CODE")
    private String provCode;

    @Column(name = "PROV_ACTIVE")
    private Integer provActive;

    @Column(name = "PROV_NOTE")
    private String provNote;

    /**
     * @return PROV_ID
     */
    public Long getProvId() {
        return provId;
    }

    /**
     * @param provId
     */
    public void setProvId(Long provId) {
        this.provId = provId;
    }

    /**
     * @return PROV_NAME
     */
    public String getProvName() {
        return provName;
    }

    /**
     * @param provName
     */
    public void setProvName(String provName) {
        this.provName = provName;
    }

    /**
     * @return PROV_CODE
     */
    public String getProvCode() {
        return provCode;
    }

    /**
     * @param provCode
     */
    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    /**
     * @return PROV_ACTIVE
     */
    public Integer getProvActive() {
        return provActive;
    }

    /**
     * @param provActive
     */
    public void setProvActive(Integer provActive) {
        this.provActive = provActive;
    }

    /**
     * @return PROV_NOTE
     */
    public String getProvNote() {
        return provNote;
    }

    /**
     * @param provNote
     */
    public void setProvNote(String provNote) {
        this.provNote = provNote;
    }
}