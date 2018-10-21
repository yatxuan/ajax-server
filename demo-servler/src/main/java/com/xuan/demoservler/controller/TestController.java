package com.xuan.demoservler.controller;

import com.xuan.demoservler.utils.ResultBean;
import org.springframework.web.bind.annotation.*;
import com.xuan.demoservler.entity.User;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2018/10/21
 * @Time: 14:20
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @GetMapping("/get1")
    public ResultBean get1() {
        System.out.println("进入get1方法");
        return new ResultBean("get1 ok");
    }


    @PostMapping("/postJson")
    public ResultBean postJson(@RequestBody User user) {
        System.out.println("进入postJson方法");

        return new ResultBean("postJson " + user.getName());
    }

    @GetMapping("/getCookie")
    public ResultBean getCookie(@CookieValue(value = "cookie1") String cookie1) {
        System.out.println("进入getCookie方法");
        return new ResultBean("getCookie " + cookie1);
    }

    @GetMapping("/getHeader")
    public ResultBean getHeader(@RequestHeader("x-header1") String header1,
                                @RequestHeader("x-header2") String header2) {
        System.out.println("进入getHeader方法");

        return new ResultBean("getHeader " + header1 + " " + header2);
    }
}
