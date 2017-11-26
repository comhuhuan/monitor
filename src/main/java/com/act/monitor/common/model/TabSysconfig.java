package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_sysconfig")
public class TabSysconfig {
    @Id
    private String configid;

    private String defaultval;

    private String configval;

    private String note;

    /**
     * @return configid
     */
    public String getConfigid() {
        return configid;
    }

    /**
     * @param configid
     */
    public void setConfigid(String configid) {
        this.configid = configid;
    }

    /**
     * @return defaultval
     */
    public String getDefaultval() {
        return defaultval;
    }

    /**
     * @param defaultval
     */
    public void setDefaultval(String defaultval) {
        this.defaultval = defaultval;
    }

    /**
     * @return configval
     */
    public String getConfigval() {
        return configval;
    }

    /**
     * @param configval
     */
    public void setConfigval(String configval) {
        this.configval = configval;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}