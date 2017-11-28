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
@Table(name = "warningdetailtable")
public class Warningdetailtable implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //异常大类
    @Id
    private Integer parentclass;
	
	    //异常大类详述
    @Column(name = "parentclassdetail")
    private String parentclassdetail;
	
	    //异常小类
    @Column(name = "childclass")
    private Integer childclass;
	
	    //异常小类详述
    @Column(name = "childclassdetail")
    private String childclassdetail;
	

	/**
	 * 设置：异常大类
	 */
	public void setParentclass(Integer parentclass) {
		this.parentclass = parentclass;
	}
	/**
	 * 获取：异常大类
	 */
	public Integer getParentclass() {
		return parentclass;
	}
	/**
	 * 设置：异常大类详述
	 */
	public void setParentclassdetail(String parentclassdetail) {
		this.parentclassdetail = parentclassdetail;
	}
	/**
	 * 获取：异常大类详述
	 */
	public String getParentclassdetail() {
		return parentclassdetail;
	}
	/**
	 * 设置：异常小类
	 */
	public void setChildclass(Integer childclass) {
		this.childclass = childclass;
	}
	/**
	 * 获取：异常小类
	 */
	public Integer getChildclass() {
		return childclass;
	}
	/**
	 * 设置：异常小类详述
	 */
	public void setChildclassdetail(String childclassdetail) {
		this.childclassdetail = childclassdetail;
	}
	/**
	 * 获取：异常小类详述
	 */
	public String getChildclassdetail() {
		return childclassdetail;
	}
}
