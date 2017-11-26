package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_menu")
public class TabMenu {
    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "menu_name_ch")
    private String menuNameCh;

    @Column(name = "menu_name_en")
    private String menuNameEn;

    @Column(name = "menu_name_big")
    private String menuNameBig;

    @Column(name = "menu_title_ch")
    private String menuTitleCh;

    @Column(name = "menu_title_en")
    private String menuTitleEn;

    @Column(name = "menu_title_big")
    private String menuTitleBig;

    @Column(name = "menu_image")
    private String menuImage;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "menu_parameter")
    private String menuParameter;

    @Column(name = "show_seq")
    private Integer showSeq;

    @Column(name = "op_type")
    private String opType;

    private String verflag;

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return menu_name_ch
     */
    public String getMenuNameCh() {
        return menuNameCh;
    }

    /**
     * @param menuNameCh
     */
    public void setMenuNameCh(String menuNameCh) {
        this.menuNameCh = menuNameCh;
    }

    /**
     * @return menu_name_en
     */
    public String getMenuNameEn() {
        return menuNameEn;
    }

    /**
     * @param menuNameEn
     */
    public void setMenuNameEn(String menuNameEn) {
        this.menuNameEn = menuNameEn;
    }

    /**
     * @return menu_name_big
     */
    public String getMenuNameBig() {
        return menuNameBig;
    }

    /**
     * @param menuNameBig
     */
    public void setMenuNameBig(String menuNameBig) {
        this.menuNameBig = menuNameBig;
    }

    /**
     * @return menu_title_ch
     */
    public String getMenuTitleCh() {
        return menuTitleCh;
    }

    /**
     * @param menuTitleCh
     */
    public void setMenuTitleCh(String menuTitleCh) {
        this.menuTitleCh = menuTitleCh;
    }

    /**
     * @return menu_title_en
     */
    public String getMenuTitleEn() {
        return menuTitleEn;
    }

    /**
     * @param menuTitleEn
     */
    public void setMenuTitleEn(String menuTitleEn) {
        this.menuTitleEn = menuTitleEn;
    }

    /**
     * @return menu_title_big
     */
    public String getMenuTitleBig() {
        return menuTitleBig;
    }

    /**
     * @param menuTitleBig
     */
    public void setMenuTitleBig(String menuTitleBig) {
        this.menuTitleBig = menuTitleBig;
    }

    /**
     * @return menu_image
     */
    public String getMenuImage() {
        return menuImage;
    }

    /**
     * @param menuImage
     */
    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return menu_parameter
     */
    public String getMenuParameter() {
        return menuParameter;
    }

    /**
     * @param menuParameter
     */
    public void setMenuParameter(String menuParameter) {
        this.menuParameter = menuParameter;
    }

    /**
     * @return show_seq
     */
    public Integer getShowSeq() {
        return showSeq;
    }

    /**
     * @param showSeq
     */
    public void setShowSeq(Integer showSeq) {
        this.showSeq = showSeq;
    }

    /**
     * @return op_type
     */
    public String getOpType() {
        return opType;
    }

    /**
     * @param opType
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * @return verflag
     */
    public String getVerflag() {
        return verflag;
    }

    /**
     * @param verflag
     */
    public void setVerflag(String verflag) {
        this.verflag = verflag;
    }
}