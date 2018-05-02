package org.dubbot.consummer.dubbo;

import java.util.List;

import org.dubbot.api.model.TangoModel;
import org.dubbot.api.service.TangoService;
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
}
