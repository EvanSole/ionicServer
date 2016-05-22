package com.os.ionic.controller;

import com.alibaba.fastjson.JSON;
import com.os.ionic.entity.IonicEntity;
import com.os.ionic.service.IIonicService;
import com.os.ionic.service.impl.IonicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ionic")
public class ionicAPIController {

    @Autowired
    private IIonicService ionicService;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable Long id) {
        IonicEntity ionicEntity = ionicService.selectIonic(id);
        return JSON.toJSONString(ionicEntity);
    }
}
