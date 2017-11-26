package com.act.monitor.common.biz;

import com.act.monitor.common.mapper.ExceptionTableMapper;
import com.act.monitor.common.model.ExceptionTable;
import com.act.monitor.common.utils.BaseBiz;
import com.act.monitor.web.vo.AlarmVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ExceptionTableBiz
 * Description:
 * author: Administrator
 * 2017/11/26 0026
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ExceptionTableBiz  extends BaseBiz<ExceptionTableMapper,ExceptionTable>{
    public List<ExceptionTable> getPageList(AlarmVo alarmVo) {
       return mapper.getPageList(alarmVo);
    }
}
