package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "web_sys_config")
public class WebSysConfig {
    /**
     * 配置参数名称
     */
    @Id
    private String configid;

    /**
     * 配置默认值
     */
    private String defaultval;

    private String configval;

    /**
     * 页面显示说明
     */
    private String title;

    /**
     * 配置描述
     */
    private String remark;

    /**
     * 0-输入框，1-下拉框(暂不支持), 2-开关
     */
    private String showtype;

    /**
     * 0-不可配置 1-可配
     */
    private String hidden;

    /**
     * 排序字段
     */
    private Integer showseq;

    /**
     * 获取配置参数名称
     *
     * @return configid - 配置参数名称
     */
    public String getConfigid() {
        return configid;
    }

    /**
     * 设置配置参数名称
     *
     * @param configid 配置参数名称
     */
    public void setConfigid(String configid) {
        this.configid = configid;
    }

    /**
     * 获取配置默认值
     *
     * @return defaultval - 配置默认值
     */
    public String getDefaultval() {
        return defaultval;
    }

    /**
     * 设置配置默认值
     *
     * @param defaultval 配置默认值
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
     * 获取页面显示说明
     *
     * @return title - 页面显示说明
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置页面显示说明
     *
     * @param title 页面显示说明
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取配置描述
     *
     * @return remark - 配置描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置配置描述
     *
     * @param remark 配置描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取0-输入框，1-下拉框(暂不支持), 2-开关
     *
     * @return showtype - 0-输入框，1-下拉框(暂不支持), 2-开关
     */
    public String getShowtype() {
        return showtype;
    }

    /**
     * 设置0-输入框，1-下拉框(暂不支持), 2-开关
     *
     * @param showtype 0-输入框，1-下拉框(暂不支持), 2-开关
     */
    public void setShowtype(String showtype) {
        this.showtype = showtype;
    }

    /**
     * 获取0-不可配置 1-可配
     *
     * @return hidden - 0-不可配置 1-可配
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * 设置0-不可配置 1-可配
     *
     * @param hidden 0-不可配置 1-可配
     */
    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    /**
     * 获取排序字段
     *
     * @return showseq - 排序字段
     */
    public Integer getShowseq() {
        return showseq;
    }

    /**
     * 设置排序字段
     *
     * @param showseq 排序字段
     */
    public void setShowseq(Integer showseq) {
        this.showseq = showseq;
    }
}