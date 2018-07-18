package com.moll.feign.feignServices.fallback;

import com.moll.feign.feignServices.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author: zhangzy
 * @create: 2018-07-18
 */
//hystrix-feign-3 实现feign 接口， 实现方法作为fallback 方法
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
