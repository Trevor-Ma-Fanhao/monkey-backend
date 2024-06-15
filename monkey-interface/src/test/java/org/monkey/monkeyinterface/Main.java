package org.monkey.monkeyinterface;


import org.monkey.monkeyclientsdk.client.MonkeyApiClient;
import org.monkey.monkeyclientsdk.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "yupi";
        String secretKey = "abcdefg";

        MonkeyApiClient monkeyApiClient = new MonkeyApiClient(accessKey, secretKey);
        String result1 = monkeyApiClient.getNameByGet("trevor");
        String result2 = monkeyApiClient.getNameByPost("trevor");
        User user = new User();
        user.setUsername("cui-trevor");
        String result3 = monkeyApiClient.getUserNameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
