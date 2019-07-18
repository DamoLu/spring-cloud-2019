package com.my.controller;

import com.my.feignclient.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: luqihua
 * @CreateDate: 2019/7/18$ 23:07$
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
