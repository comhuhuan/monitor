package com.act.monitor.common.mapper;

import com.act.monitor.common.entity.MonsysAllIdcInfo;
import com.act.monitor.web.vo.DeviceCountVo;
import com.act.monitor.web.vo.DeviceInfoVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Yomo
 * @email 463540703@qq.com
 * @date 2017-11-28 15:06:42
 */

public interface MonsysAllIdcInfoMapper extends Mapper<MonsysAllIdcInfo> {
    List<DeviceCountVo> deviceCount(DeviceCountVo deviceVo);

    List <DeviceCountVo> pageList(DeviceCountVo deviceVo);

    DeviceCountVo findCU(DeviceCountVo deviceVo);

    List<DeviceInfoVo> deviceInfo(DeviceInfoVo deviceVo);

	
}
