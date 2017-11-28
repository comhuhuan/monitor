package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 具体权限基本表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_secondary_menu")
public class TabSecondaryMenu implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer secMenuId;
	
	    //
    @Column(name = "menu_id")
    private Integer menuId;
	
	    //
    @Column(name = "program_id")
    private String programId;
	
	    //二级菜单页面下所具有的所有操作
    @Column(name = "purview_list")
    private String purviewList;
	

	/**
	 * 设置：
	 */
	public void setSecMenuId(Integer secMenuId) {
		this.secMenuId = secMenuId;
	}
	/**
	 * 获取：
	 */
	public Integer getSecMenuId() {
		return secMenuId;
	}
	/**
	 * 设置：
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取：
	 */
	public Integer getMenuId() {
		return menuId;
	}
	/**
	 * 设置：
	 */
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	/**
	 * 获取：
	 */
	public String getProgramId() {
		return programId;
	}
	/**
	 * 设置：二级菜单页面下所具有的所有操作
	 */
	public void setPurviewList(String purviewList) {
		this.purviewList = purviewList;
	}
	/**
	 * 获取：二级菜单页面下所具有的所有操作
	 */
	public String getPurviewList() {
		return purviewList;
	}
}
