package org.monkey.monkeyapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.monkey.monkeyapicommon.model.entity.InterfaceInfo;


/**
* @author luckyma
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-04-28 18:42:43
*/
public interface InnerInterfaceInfoService extends IService<InterfaceInfo> {
    /*
    * 从数据库中查询模拟接口是否存在
    * */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
