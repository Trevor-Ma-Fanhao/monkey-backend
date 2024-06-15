package org.monkey.monkeyinterface;

import org.junit.jupiter.api.Test;
import org.monkey.monkeyclientsdk.client.MonkeyApiClient;
import org.monkey.monkeyclientsdk.model.User;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MonkeyInterfaceApplicationTests {

    // 注入一个名为monkeyApiClient的方法
    @Resource
    private MonkeyApiClient monkeyApiClient;

    @Test
    void contextLoads() {
        // 调用monkeyApiClient的getnamebyget 方法 传入参数yupi
        String result = monkeyApiClient.getNameByGet("trevor");
        User user = new User();
        user.setUsername("cui-trevor");
        String usernameByPost = monkeyApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
