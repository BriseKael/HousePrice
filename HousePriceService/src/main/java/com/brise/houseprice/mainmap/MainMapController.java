package com.brise.houseprice.mainmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainMapController {
    @Autowired
    MainMapService mainMapService;

    @GetMapping("/mainmap")
    public MainMapVo getMainMap() {
        MainMapVo vo = new MainMapVo();
        vo.setData("hello world");
        mainMapService.DoSomething();
        return vo;
    }
}
