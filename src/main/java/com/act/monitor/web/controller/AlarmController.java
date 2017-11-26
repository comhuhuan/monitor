package com.act.monitor.web.controller;

import com.act.monitor.common.mapper.ExceptionTableMapper;
import com.act.monitor.common.model.ExceptionTable;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * AlarmController
 * Description:
 * author: Administrator
 * 2017/11/26 0026
 */
@Controller
@RequestMapping("monitor")
public class AlarmController extends BaseController {
    private final Logger log = LoggerFactory.getLogger(AlarmController.class);


    @Autowired
    ExceptionTableMapper exceptionTableMapper;

    @ResponseBody
    @RequestMapping(value = "alarm/alarmList.do")
    public Object pagingList(@RequestParam String valid, @RequestParam String parentclass,
                             @RequestParam(required = true, defaultValue = "1") Integer pageIndex,
                             @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageInfo<ExceptionTable> exceptionTablePageInfo;
        try {
            List<ExceptionTable> pageList = exceptionTableMapper.getPageList(valid, parentclass);
            PageHelper.startPage(pageIndex, pageSize);
            exceptionTablePageInfo = new PageInfo<>(pageList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("分页查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, exceptionTablePageInfo);
    }
}
