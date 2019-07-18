package com.my.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: java类作用描述
 * @Author: luqihua
 * @CreateDate: 2019/7/18$ 23:03$
 */

@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @GetMapping("/hello")
    String sayHiFromClientOne(String name);
}
