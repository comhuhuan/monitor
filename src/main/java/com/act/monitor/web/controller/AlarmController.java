package com.act.monitor.web.controller;

import com.act.monitor.common.mapper.ExceptionTableMapper;

import com.act.monitor.web.vo.AlarmVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * AlarmController
 * Description:
 * author: Administrator
 * 2017/11/26 0026
 */
@Controller
@RequestMapping("monitor")
public class AlarmController  {
    private final Logger log = LoggerFactory.getLogger(AlarmController.class);

    @Autowired
    ExceptionTableMapper exceptionTableMapper;

    @ResponseBody
    @RequestMapping(value = "alarm/alarmList.do")
    public Object pagingList(AlarmVo alarmVo) {

        exceptionTableMapper.getPageList( alarmVo );

        System.out.println("222");
        return 111;
    }

}
