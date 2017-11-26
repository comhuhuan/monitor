package com.act.monitor.common.model;

import javax.persistence.*;

public class Warningdetailtable {
    /**
     * 异常大类
     */
    @Id
    private Integer parentclass;

    /**
     * 异常小类
     */
    @Id
    private Integer childclass;

    /**
     * 异常大类详述
     */
    private String parentclassdetail;

    /**
     * 异常小类详述
     */
    private String childclassdetail;

    /**
     * 获取异常大类
     *
     * @return parentclass - 异常大类
     */
    public Integer getParentclass() {
        return parentclass;
    }

    /**
     * 设置异常大类
     *
     * @param parentclass 异常大类
     */
    public void setParentclass(Integer parentclass) {
        this.parentclass = parentclass;
    }

    /**
     * 获取异常小类
     *
     * @return childclass - 异常小类
     */
    public Integer getChildclass() {
        return childclass;
    }

    /**
     * 设置异常小类
     *
     * @param childclass 异常小类
     */
    public void setChildclass(Integer childclass) {
        this.childclass = childclass;
    }

    /**
     * 获取异常大类详述
     *
     * @return parentclassdetail - 异常大类详述
     */
    public String getParentclassdetail() {
        return parentclassdetail;
    }

    /**
     * 设置异常大类详述
     *
     * @param parentclassdetail 异常大类详述
     */
    public void setParentclassdetail(String parentclassdetail) {
        this.parentclassdetail = parentclassdetail;
    }

    /**
     * 获取异常小类详述
     *
     * @return childclassdetail - 异常小类详述
     */
    public String getChildclassdetail() {
        return childclassdetail;
    }

    /**
     * 设置异常小类详述
     *
     * @param childclassdetail 异常小类详述
     */
    public void setChildclassdetail(String childclassdetail) {
        this.childclassdetail = childclassdetail;
    }
}