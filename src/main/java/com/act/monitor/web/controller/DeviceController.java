package com.act.monitor.web.controller;

import com.act.monitor.web.vo.DeviceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DeviceController
 * Description:
 * author: Administrator
 * 2017/11/26 0026
 */
@Controller
@RequestMapping("/monitor/device")
public class DeviceController extends BaseController {
    private final Logger log = LoggerFactory.getLogger(DeviceController.class);




    @ResponseBody
    @RequestMapping(value = "/pagingList.do")
    public Object pagingList(Integer pageIndex, Integer pageSize, DeviceVo deviceVo) {
        try {

        } catch (Exception e) {
            log.error("分页查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success);
    }
}
