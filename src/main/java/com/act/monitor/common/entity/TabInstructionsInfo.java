package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:42
 */
@Table(name = "tab_instructions_info")
public class TabInstructionsInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键自增ID
    @Id
    private Integer instructionid;
	
	    //下发失败和下发成功
    @Column(name = "status")
    private String status;
	
	    //CU配置EU配置和WEB配置
    @Column(name = "type")
    private String type;
	
	    //指令下发ip
    @Column(name = "ip")
    private String ip;
	
	    //指令下发时间
    @Column(name = "date")
    private Date date;
	

	/**
	 * 设置：主键自增ID
	 */
	public void setInstructionid(Integer instructionid) {
		this.instructionid = instructionid;
	}
	/**
	 * 获取：主键自增ID
	 */
	public Integer getInstructionid() {
		return instructionid;
	}
	/**
	 * 设置：下发失败和下发成功
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：下发失败和下发成功
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：CU配置EU配置和WEB配置
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：CU配置EU配置和WEB配置
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：指令下发ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：指令下发ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：指令下发时间
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * 获取：指令下发时间
	 */
	public Date getDate() {
		return date;
	}
}
