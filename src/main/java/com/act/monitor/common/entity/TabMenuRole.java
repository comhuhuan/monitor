package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 菜单表权限控制表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_menu_role")
public class TabMenuRole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer menuId;
	
	    //
    @Column(name = "parent_id")
    private Integer parentId;
	
	    //
    @Column(name = "menu_name_ch")
    private String menuNameCh;
	
	    //
    @Column(name = "menu_url")
    private String menuUrl;
	
	    //
    @Column(name = "show_seq")
    private Integer showSeq;
	
	    //Y -表启用 -N不启用
    @Column(name = "is_active")
    private String isActive;
	

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
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：
	 */
	public void setMenuNameCh(String menuNameCh) {
		this.menuNameCh = menuNameCh;
	}
	/**
	 * 获取：
	 */
	public String getMenuNameCh() {
		return menuNameCh;
	}
	/**
	 * 设置：
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	/**
	 * 获取：
	 */
	public String getMenuUrl() {
		return menuUrl;
	}
	/**
	 * 设置：
	 */
	public void setShowSeq(Integer showSeq) {
		this.showSeq = showSeq;
	}
	/**
	 * 获取：
	 */
	public Integer getShowSeq() {
		return showSeq;
	}
	/**
	 * 设置：Y -表启用 -N不启用
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	/**
	 * 获取：Y -表启用 -N不启用
	 */
	public String getIsActive() {
		return isActive;
	}
}
