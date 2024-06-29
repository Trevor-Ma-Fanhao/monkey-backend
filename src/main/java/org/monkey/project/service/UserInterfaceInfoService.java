package org.monkey.project.service;
import com.baomidou.mybatisplus.extension.service.IService;
import org.monkey.monkeyapicommon.model.entity.UserInterfaceInfo;
/**
 * 用户接口信息服务
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}