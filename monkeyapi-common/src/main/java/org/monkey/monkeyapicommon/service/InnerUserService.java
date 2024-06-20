package org.monkey.monkeyapicommon.service;


import org.monkey.monkeyapicommon.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService extends IService<User> {

    /*
    * 数据库中查是否已分配给用户密钥（ak）
    * */
    User getInvokeUser(String accessKey);


}
