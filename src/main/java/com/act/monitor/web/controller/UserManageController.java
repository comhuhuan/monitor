package com.act.monitor.web.controller;

import com.act.monitor.common.mapper.TabSysUserMapper;
import com.act.monitor.common.entity.TabSysUser;
import com.act.monitor.web.vo.UserVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * UserManageController
 * Description:
 * author: Administrator
 * 2017/11/28 0028
 */

@Controller
@RequestMapping("/monitor/user")
public class UserManageController extends BaseController {


    @Autowired
    TabSysUserMapper tabSysUserMapper;

    /**
     * @Title: pagingList
     * @Description:用户管理 分页查询 //TODO
     * @create 2017年6月30日16:31:26
     * @update 2017年6月30日16:31:26
     */
    @ResponseBody
    @RequestMapping(value = "/pagingList.do")

    public Object pagingList(Integer pageIndex, Integer pageSize, UserVo userVo) {
        PageInfo<TabSysUser> tabSysUserPageInfo;
        try {
            List<TabSysUser> tabSysUsers = tabSysUserMapper.pagingList(userVo);
            tabSysUserPageInfo = new PageInfo<>(tabSysUsers);
        } catch (Exception e) {
            log.error("分页查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success,   tabSysUserPageInfo );
    }

    /**
     * @Title: getIdcList
     * @Description:获取全国运营商 //数据来源 monsys_all_idc_info
     * @create 2017年7月4日11:08:59
     * @update 2017年7月4日11:08:59
     */
    @ResponseBody
    @RequestMapping(value = "/getIdcList.do")
    public Object getIdcList() {
        try {
            Object result = userManageService.getIdcList();
            return ajax(Status.success, result);
        } catch (Exception e) {
            log.error("分页查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
    }

    /**
     * @Title: save
     * @Description:新增/编辑用户
     * @create 2017年7月4日11:24:30
     * @update 2017年7月4日11:24:30
     */
    @ResponseBody
    @RequestMapping(value = "/addUser.do")
    public Object save(TabSysUser user, String commonFlag) {
        try {
            userManageService.save(user, commonFlag);
        } catch (Exception e) {
            log.error("新增用户失败", e);
            return ajax(Status.error, "编辑失败!");
        }
        return ajax(Status.success, "编辑成功");
    }

    /**
     * @param userId
     * @throws
     * @Title: remove
     * @Description: (删除 tab_sys_user)
     * @create 2017年7月4日16:05:31
     * @update 2017年7月4日16:05:31
     */
    @ResponseBody
    @RequestMapping(value = "/remove.do")
    public Object remove(String userId) {
        try {
            userManageService.remove(userId);
        } catch (Exception e) {
            logger.error("删除tab_sys_user失败", e);
            return ajax(Status.error, "删除失败!");
        }
        return ajax(Status.success, "删除成功");
    }
}
