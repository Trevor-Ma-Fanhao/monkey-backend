package org.monkey.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.monkey.monkeyapicommon.model.entity.InterfaceInfo;

/**
* @author luckyma
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-04-28 18:42:43
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
