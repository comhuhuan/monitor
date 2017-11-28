package com.act.monitor.common.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 菜单表
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:41
 */
@Table(name = "tab_menu")
public class TabMenu implements Serializable {
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
    @Column(name = "menu_name_en")
    private String menuNameEn;
	
	    //
    @Column(name = "menu_name_big")
    private String menuNameBig;
	
	    //
    @Column(name = "menu_title_ch")
    private String menuTitleCh;
	
	    //
    @Column(name = "menu_title_en")
    private String menuTitleEn;
	
	    //
    @Column(name = "menu_title_big")
    private String menuTitleBig;
	
	    //
    @Column(name = "menu_image")
    private String menuImage;
	
	    //
    @Column(name = "menu_url")
    private String menuUrl;
	
	    //
    @Column(name = "menu_parameter")
    private String menuParameter;
	
	    //
    @Column(name = "show_seq")
    private Integer showSeq;
	
	    //
    @Column(name = "op_type")
    private String opType;
	
	    //
    @Column(name = "verflag")
    private String verflag;
	

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
	public void setMenuNameEn(String menuNameEn) {
		this.menuNameEn = menuNameEn;
	}
	/**
	 * 获取：
	 */
	public String getMenuNameEn() {
		return menuNameEn;
	}
	/**
	 * 设置：
	 */
	public void setMenuNameBig(String menuNameBig) {
		this.menuNameBig = menuNameBig;
	}
	/**
	 * 获取：
	 */
	public String getMenuNameBig() {
		return menuNameBig;
	}
	/**
	 * 设置：
	 */
	public void setMenuTitleCh(String menuTitleCh) {
		this.menuTitleCh = menuTitleCh;
	}
	/**
	 * 获取：
	 */
	public String getMenuTitleCh() {
		return menuTitleCh;
	}
	/**
	 * 设置：
	 */
	public void setMenuTitleEn(String menuTitleEn) {
		this.menuTitleEn = menuTitleEn;
	}
	/**
	 * 获取：
	 */
	public String getMenuTitleEn() {
		return menuTitleEn;
	}
	/**
	 * 设置：
	 */
	public void setMenuTitleBig(String menuTitleBig) {
		this.menuTitleBig = menuTitleBig;
	}
	/**
	 * 获取：
	 */
	public String getMenuTitleBig() {
		return menuTitleBig;
	}
	/**
	 * 设置：
	 */
	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}
	/**
	 * 获取：
	 */
	public String getMenuImage() {
		return menuImage;
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
	public void setMenuParameter(String menuParameter) {
		this.menuParameter = menuParameter;
	}
	/**
	 * 获取：
	 */
	public String getMenuParameter() {
		return menuParameter;
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
	 * 设置：
	 */
	public void setOpType(String opType) {
		this.opType = opType;
	}
	/**
	 * 获取：
	 */
	public String getOpType() {
		return opType;
	}
	/**
	 * 设置：
	 */
	public void setVerflag(String verflag) {
		this.verflag = verflag;
	}
	/**
	 * 获取：
	 */
	public String getVerflag() {
		return verflag;
	}
}
