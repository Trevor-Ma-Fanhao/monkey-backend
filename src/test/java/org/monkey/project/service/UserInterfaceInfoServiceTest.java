package org.monkey.project.service;


import org.junit.jupiter.api.Assertions;
// 自动生成的包不对
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.monkey.monkeyapicommon.service.InnerUserInterfaceInfoService;

import javax.annotation.Resource;

@SpringBootTest

public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    @Test
    public void invokeCount() {
        // 调用invokeCount方法 传入两个参数（1L， 1L）
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        // 表示断言b的值为true 即返回true
        Assertions.assertTrue(b);
    }
}