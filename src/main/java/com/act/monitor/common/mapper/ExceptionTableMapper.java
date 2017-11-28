package com.act.monitor.common.mapper;

import com.act.monitor.common.entity.ExceptionTable;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Yomo
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:42
 */

public interface ExceptionTableMapper extends Mapper<ExceptionTable> {

    List<ExceptionTable> getPageList(String valid, String parentclass);
}
