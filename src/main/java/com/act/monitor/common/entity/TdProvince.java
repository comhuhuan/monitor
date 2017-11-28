package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:40
 */
@Table(name = "td_province")
public class TdProvince implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long provId;
	
	    //
    @Column(name = "PROV_NAME")
    private String provName;
	
	    //
    @Column(name = "PROV_CODE")
    private String provCode;
	
	    //
    @Column(name = "PROV_ACTIVE")
    private Integer provActive;
	
	    //
    @Column(name = "PROV_NOTE")
    private String provNote;
	

	/**
	 * 设置：
	 */
	public void setProvId(Long provId) {
		this.provId = provId;
	}
	/**
	 * 获取：
	 */
	public Long getProvId() {
		return provId;
	}
	/**
	 * 设置：
	 */
	public void setProvName(String provName) {
		this.provName = provName;
	}
	/**
	 * 获取：
	 */
	public String getProvName() {
		return provName;
	}
	/**
	 * 设置：
	 */
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	/**
	 * 获取：
	 */
	public String getProvCode() {
		return provCode;
	}
	/**
	 * 设置：
	 */
	public void setProvActive(Integer provActive) {
		this.provActive = provActive;
	}
	/**
	 * 获取：
	 */
	public Integer getProvActive() {
		return provActive;
	}
	/**
	 * 设置：
	 */
	public void setProvNote(String provNote) {
		this.provNote = provNote;
	}
	/**
	 * 获取：
	 */
	public String getProvNote() {
		return provNote;
	}
}
