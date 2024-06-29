package org.monkey.monkeyinterface.controller;


import org.monkey.monkeyclientsdk.model.User;
import org.monkey.monkeyclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name){
        return "GET 你的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
        // keypoint 这里注释掉了一开始写的校验逻辑 由于gateway 帮我们做了这件事了所以无需重复 这也是这个项目核心的出发点 帮助个人api开发者减轻负担
        // 1. 拿到这五个我们可以一步一步去做校验 比如ak 先去数据库中查一下
        // 从请求头中获取参数
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
        // 注意 这里不能直接获取密钥
        // 2. 校验权限 这里模拟一下 直接判断ak是否为 yupi 实际情况应该查询数据库验证权限
//        if(!accessKey.equals("78a0c9044f745f71c29766c1dd0453eb")){
//            throw new RuntimeException("无权限");
//        }
        // todo 3. 校验一下随机数 这里没有在后端进行存储 后端存储使用hashmap或者redis都可以
        // 校验随机数 模拟一下 直接判断 nonce 是否大于10000
//        if (Long.parseLong(nonce) > 10000){
//            throw new RuntimeException("无权限");
//        }
        // todo 4. 校验时间戳与当前时间的差距
        // if（timestamp）{}
        //todo 实际情况是从数据库中查出sk
//        String serverSign = SignUtils.genSign(body, "27ccf3f9793fe4bdee5a7982d35fcc2c");
//        // 生成的sign 不一致 -》 无权限
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }

        return "POST 用户名字是" + user.getUsername();
    }
}
