package com.act.monitor.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tab_instructions_info")
public class TabInstructionsInfo {
    /**
     * 主键自增ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instructionid;

    /**
     * 下发失败和下发成功
     */
    private String status;

    /**
     * CU配置EU配置和WEB配置
     */
    private String type;

    /**
     * 指令下发ip
     */
    private String ip;

    /**
     * 指令下发时间
     */
    private Date date;

    /**
     * 获取主键自增ID
     *
     * @return instructionid - 主键自增ID
     */
    public Integer getInstructionid() {
        return instructionid;
    }

    /**
     * 设置主键自增ID
     *
     * @param instructionid 主键自增ID
     */
    public void setInstructionid(Integer instructionid) {
        this.instructionid = instructionid;
    }

    /**
     * 获取下发失败和下发成功
     *
     * @return status - 下发失败和下发成功
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置下发失败和下发成功
     *
     * @param status 下发失败和下发成功
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取CU配置EU配置和WEB配置
     *
     * @return type - CU配置EU配置和WEB配置
     */
    public String getType() {
        return type;
    }

    /**
     * 设置CU配置EU配置和WEB配置
     *
     * @param type CU配置EU配置和WEB配置
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取指令下发ip
     *
     * @return ip - 指令下发ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置指令下发ip
     *
     * @param ip 指令下发ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取指令下发时间
     *
     * @return date - 指令下发时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置指令下发时间
     *
     * @param date 指令下发时间
     */
    public void setDate(Date date) {
        this.date = date;
    }
}