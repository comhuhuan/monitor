package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_menu_role")
public class TabMenuRole {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "menu_name_ch")
    private String menuNameCh;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "show_seq")
    private Byte showSeq;

    /**
     * Y -表启用 -N不启用
     */
    @Column(name = "is_active")
    private String isActive;

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
     * @return show_seq
     */
    public Byte getShowSeq() {
        return showSeq;
    }

    /**
     * @param showSeq
     */
    public void setShowSeq(Byte showSeq) {
        this.showSeq = showSeq;
    }

    /**
     * 获取Y -表启用 -N不启用
     *
     * @return is_active - Y -表启用 -N不启用
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * 设置Y -表启用 -N不启用
     *
     * @param isActive Y -表启用 -N不启用
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}