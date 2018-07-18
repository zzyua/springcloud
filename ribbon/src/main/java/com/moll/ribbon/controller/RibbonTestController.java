package com.moll.ribbon.controller;

import com.moll.ribbon.service.RibbonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * 此处controller  调用ribbon中的service ，
 * 由service 再调用api中的 对外开放的接口
 * @author: zhangzy
 * @create: 2018-07-18
 */
@RestController
public class RibbonTestController {

    @Autowired
    RibbonTestService ribbonService;

    @RequestMapping(value = "/ribbon/name")
    public String hi(@RequestParam String name){
        return  ribbonService.portService(name) ;
    }
    //localhost:8764/ribbon/name?name=cxx
}
