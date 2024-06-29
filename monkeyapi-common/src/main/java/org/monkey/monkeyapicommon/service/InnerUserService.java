package org.monkey.monkeyapicommon.service;


import org.monkey.monkeyapicommon.model.entity.User;

import javax.annotation.Resource;

/**
 * 用户服务
 *
 */

public interface InnerUserService {

    /*
    * 数据库中查是否已分配给用户密钥（ak）
    * */
    User getInvokeUser(String accessKey);


}
