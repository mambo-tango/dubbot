package org.dubbot.api.service.stub;

import java.util.concurrent.ConcurrentHashMap;

import org.dubbot.api.service.TangoService;
import org.springframework.stereotype.Component;

@Component
public class TangoServiceStub implements TangoService{
    
    private final TangoService tangoLocalService;
    public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    
    public TangoServiceStub(TangoService tangoService){
        this.tangoLocalService = tangoService;
    }

    @Override
    public String helloTango(String key) {
        
        if(map.size() ==0) {
            String result = tangoLocalService.helloTango(key);
            map.put("result", result);
        }else {
            System.out.println("+++++++++从缓存获取数据>>>"+map.get("result")+"++++");
        }
        
        return map.get("result");
    }

}
