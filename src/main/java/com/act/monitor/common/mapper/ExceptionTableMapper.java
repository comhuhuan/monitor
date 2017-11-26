package com.act.monitor.common.mapper;

import com.act.monitor.common.model.ExceptionTable;
import com.act.monitor.common.utils.MyMapper;
import com.act.monitor.web.vo.AlarmVo;

import java.util.List;

public interface ExceptionTableMapper extends MyMapper<ExceptionTable> {
    List<ExceptionTable>  getPageList(AlarmVo alarmVo);
}