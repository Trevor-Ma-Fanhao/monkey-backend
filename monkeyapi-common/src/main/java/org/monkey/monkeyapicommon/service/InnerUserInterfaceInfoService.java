package org.monkey.monkeyapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.monkey.monkeyapicommon.model.entity.InterfaceInfo;
import org.monkey.monkeyapicommon.model.entity.User;
import org.monkey.monkeyapicommon.model.entity.UserInterfaceInfo;

/**
* @author luckyma
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-06-16 01:47:22
*/
public interface InnerUserInterfaceInfoService extends IService<UserInterfaceInfo> {
    /*
    * 调用接口统计
    * 参数 interfaceInfoId  userId
    * */
    boolean invokeCount(long interfaceInfoId, long userId);

}
