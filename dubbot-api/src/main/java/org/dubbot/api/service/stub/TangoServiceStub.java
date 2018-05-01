package org.dubbot.api.service.stub;

import java.util.concurrent.ConcurrentHashMap;

import org.dubbot.api.service.TangoService;
import org.springframework.stereotype.Component;

@Component
public class TangoServiceStub implements TangoService{
    
    private final TangoService tangoService;
    public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    
    public TangoServiceStub(TangoService tangoService){
        this.tangoService = tangoService;
    }

    @Override
    public String helloTango(String key) {
        
        if(map.size() ==0) {
            String result = tangoService.helloTango(key);
            map.put("result", result);
        }
        
        return map.get("result");
    }

}
