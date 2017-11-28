package com.act.monitor.web.controller;

import com.act.monitor.common.mapper.MonsysAllIdcInfoMapper;
import com.act.monitor.web.vo.DeviceCountVo;
import com.act.monitor.web.vo.DeviceHistoryVo;
import com.act.monitor.web.vo.DeviceInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoleilu.hutool.db.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DeviceCountController
 * Description:
 * author: Administrator
 * 2017/11/27 0027
 */

@Controller
@RequestMapping("/monitor/deviceCount")
public class DeviceCountController extends BaseController {
    private final Logger log = LoggerFactory.getLogger(AlarmController.class);


    @Autowired
    MonsysAllIdcInfoMapper monsysAllIdcInfoMapper;

    /**
     * @Title: deviceCount
     * @Description:查询全国IDC的故障设备分布情况 //TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/deviceCount.do")
    public Object deviceCount(Integer pageIndex, Integer pageSize, DeviceCountVo deviceVo) {
        List<DeviceCountVo> resultList = null;
        try {



            resultList = monsysAllIdcInfoMapper.deviceCount(deviceVo);
        } catch (Exception e) {
            log.error("查询失败!", e);
            e.printStackTrace();
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, resultList);
    }

    /**
     * @Title: pagingList
     * @Description:查询设备故障信息列表//TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/pageList.do")
    public Object pageList(Integer pageIndex, Integer pageSize, DeviceCountVo deviceVo) {
        List<DeviceCountVo> deviceCountVos;
        try {

            deviceCountVos = monsysAllIdcInfoMapper.pageList(deviceVo);
            PageHelper.startPage(pageIndex, pageSize);
            new PageInfo<>(deviceCountVos);
        } catch (Exception e) {
            log.error("分页查询失败!", e);
            e.printStackTrace();
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, deviceCountVos);
    }


    /**
     * @Title: deviceCount
     * @Description:查询全国IDC的故障设备分布情况 //TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/cuInter.do")
    public Object findCU(DeviceCountVo deviceVo) {
        DeviceCountVo resultList;
        try {
            resultList = monsysAllIdcInfoMapper.findCU(deviceVo);
        } catch (Exception e) {
            log.error("查询失败!", e);
            e.printStackTrace();
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, resultList);
    }

    @ResponseBody
    @RequestMapping(value = "/deviceInfo.do")
    public Object deviceInfo(Integer pageIndex, Integer pageSize, DeviceInfoVo deviceVo) {
        PageInfo<DeviceInfoVo> deviceInfoVoPageInfo;
        try {
            String uuid = deviceVo.getUuid();
            Integer devceType = deviceVo.getDevceType();
            if (null == devceType || "".equals(devceType) || null == uuid || "".equals(uuid)) {
                log.error("查询失败!", "参数错误");
                return ajax(Status.error, "参数错误");
            }
            PageHelper.startPage(pageIndex, pageSize);
            List<DeviceInfoVo> resultList = monsysAllIdcInfoMapper.deviceInfo(deviceVo);
            deviceInfoVoPageInfo = new PageInfo<>(resultList);
        } catch (Exception e) {
            log.error("查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, deviceInfoVoPageInfo);
    }


    /**
     * @Title: cuDeviceInfoHistory
     * @Description:CU设备历史故障查询（矩形图）//TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/cuDeviceInfoHistory.do")
    public Object cuDeviceInfoHistory(Integer pageIndex, Integer pageSize, DeviceHistoryVo deviceVo) {
        List<DeviceHistoryVo> resultList = null;
        try {
            String uuid = deviceVo.getUuid();
            String devceType = deviceVo.getElementType();
            if(null == devceType || "".equals(devceType) || null == uuid || "".equals(uuid)){
                log.error("查询失败!", "参数错误");
                return ajax(Status.error, "参数错误");
            }

            resultList = deviceService.cuDeviceInfoHistory(deviceVo);
        } catch (Exception e) {
            log.error("查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, resultList);
    }


    /**
     * @Title: euDeviceInfoHistory
     * @Description:EU设备历史故障查询（矩形图）//TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/euDeviceInfoHistory.do")
    public Object euDeviceInfoHistory(PageResult<DeviceHistoryVo> page, DeviceHistoryVo deviceVo) {
        List<DeviceHistoryVo> resultList = null;
        try {
            String uuid = deviceVo.getUuid();
            String devceType = deviceVo.getElementType();
            if(null == devceType || "".equals(devceType) || null == uuid || "".equals(uuid)){
                log.error("查询失败!", "参数错误");
                return ajax(Status.error, "参数错误");
            }
            resultList = deviceService.euDeviceInfoHistory(deviceVo);
        } catch (Exception e) {
            log.error("查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, resultList);
    }

    /**
     * @Title: badDevicePageList
     * @Description:CU和EU最近故障设备列表）//TODO
     * @create 2017年6月20日16:50:52
     * @update 2017年6月20日16:50:52
     */
    @ResponseBody
    @RequestMapping(value = "/badDevicePageList.do")
    public Object badDevicePageList(PageResult<DeviceInfoVo> page, DeviceInfoVo deviceVo) {
        try {
            String uuid = deviceVo.getUuid();
            Integer devceType = deviceVo.getDevceType();
            if(null == devceType || "".equals(devceType) || null == uuid || "".equals(uuid)){
                log.error("查询失败!", "参数错误");
                return ajax(Status.error, "参数错误");
            }
            page = deviceService.badDevicePageList(page,deviceVo);
        } catch (Exception e) {
            log.error("查询失败!", e);
            return ajax(Status.error, "查询失败!");
        }
        return ajax(Status.success, page);
    }



}
