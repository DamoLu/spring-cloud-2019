package com.my.fallback;

import com.my.feignclient.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: luqihua
 * @CreateDate: 2019/7/22$ 22:55$
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
