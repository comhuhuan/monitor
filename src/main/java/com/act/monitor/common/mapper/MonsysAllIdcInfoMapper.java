package com.act.monitor.common.mapper;

import com.act.monitor.common.model.MonsysAllIdcInfo;
import com.act.monitor.common.utils.MyMapper;
import com.act.monitor.web.vo.DeviceCountVo;
import com.act.monitor.web.vo.DeviceInfoVo;

import java.util.List;

public interface MonsysAllIdcInfoMapper extends MyMapper<MonsysAllIdcInfo> {
    List<DeviceCountVo> deviceCount(DeviceCountVo deviceVo);

    List <DeviceCountVo> pageList(DeviceCountVo deviceVo);

    DeviceCountVo findCU(DeviceCountVo deviceVo);

    List<DeviceInfoVo> deviceInfo(DeviceInfoVo deviceVo);
}