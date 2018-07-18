package com.moll.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 描述：ribbon 测试service类
 *
 * @author: zhangzy
 * @create: 2018-07-18
 */
@Service
public class RibbonTestService {

    @Autowired
    private  RestTemplate restTemplate ;


    /**
     * 在方法中绑定断路器的回调方法
     * @param name
     * @return
     */
    //hystrix-ribbon-3
    @HystrixCommand(fallbackMethod = "hiError")
    public String portService(String name) {
        return restTemplate.getForObject("http://API/test/port?name="+name,String.class);
    }

    //hystrix-ribbon-4
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
