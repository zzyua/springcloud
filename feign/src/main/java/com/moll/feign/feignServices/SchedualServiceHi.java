package com.moll.feign.feignServices;

import com.moll.feign.feignServices.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：
 *
 * Feign 默认集成 ribbon+ restemp 的方式， 实现了负载均衡
 * @FeignClient(value = "API")
 *      value 设置的值就是 eureka 中注册的实例。 比如spring.application.name = 'api' , api不区分大小写
 * @author: zhangzy
 * @create: 2018-07-18
 */
// hystrix-feign-2   实现接口，作为fallback 类
@FeignClient(value = "API" , fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/test/port",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
