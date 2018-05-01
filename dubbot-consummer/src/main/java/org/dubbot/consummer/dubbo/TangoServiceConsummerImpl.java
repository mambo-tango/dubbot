package org.dubbot.consummer.dubbo;

import org.dubbot.api.service.TangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TangoServiceConsummerImpl {
    @Autowired
    TangoService tangoService;

    public String getDetailFromRedis(String waybillNo) {
        String str = tangoService.helloTango(waybillNo);
        return str;
    }
}
