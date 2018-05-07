package org.dubbot.consummer.dubbo;

import java.util.List;

import org.dubbot.api.service.TangoService;
import org.dubbot.plugin.cache.TangoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TangoServiceConsummerImpl {
    @Autowired
    TangoService tangoService;

    public String getDetailFromRedis(Integer shipId) {
        List<TangoModel> results = tangoService.helloTango(shipId);
        System.out.println("======获取 "+results.size()+"个结果======");
        return "SUCCESS";
    }
    
    public String helloTango2(Integer shipId) {
        String result = tangoService.helloTango2(shipId+"");
        System.out.println("======tango2获取 "+result+" ======");
        return "success";
    }
}
