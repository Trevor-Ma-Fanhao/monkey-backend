package org.monkey.project.service.impl.inner;

import org.apache.dubbo.config.annotation.DubboService;
import org.monkey.monkeyapicommon.service.InnerUserInterfaceInfoService;
import org.monkey.project.service.UserInterfaceInfoService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 调用注入的UserInterfaceInfoService 的 invoke 方法
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
