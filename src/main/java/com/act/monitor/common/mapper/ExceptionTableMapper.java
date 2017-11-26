package com.act.monitor.common.mapper;

import com.act.monitor.common.model.ExceptionTable;
import com.act.monitor.common.utils.MyMapper;
import com.act.monitor.web.vo.AlarmVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExceptionTableMapper extends MyMapper<ExceptionTable> {
    List<ExceptionTable>  getPageList(@Param("valid") String valid,@Param("parentclass") String parentclass);
}