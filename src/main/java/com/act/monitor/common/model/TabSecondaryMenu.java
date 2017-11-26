package com.act.monitor.common.model;

import javax.persistence.*;

@Table(name = "tab_secondary_menu")
public class TabSecondaryMenu {
    @Id
    @Column(name = "sec_menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer secMenuId;

    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "program_id")
    private String programId;

    /**
     * 二级菜单页面下所具有的所有操作
     */
    @Column(name = "purview_list")
    private String purviewList;

    /**
     * @return sec_menu_id
     */
    public Integer getSecMenuId() {
        return secMenuId;
    }

    /**
     * @param secMenuId
     */
    public void setSecMenuId(Integer secMenuId) {
        this.secMenuId = secMenuId;
    }

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
     * @return program_id
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * @param programId
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * 获取二级菜单页面下所具有的所有操作
     *
     * @return purview_list - 二级菜单页面下所具有的所有操作
     */
    public String getPurviewList() {
        return purviewList;
    }

    /**
     * 设置二级菜单页面下所具有的所有操作
     *
     * @param purviewList 二级菜单页面下所具有的所有操作
     */
    public void setPurviewList(String purviewList) {
        this.purviewList = purviewList;
    }
}