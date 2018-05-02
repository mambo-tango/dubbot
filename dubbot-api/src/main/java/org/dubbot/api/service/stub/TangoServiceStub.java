package org.dubbot.api.service.stub;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.dubbot.api.model.TangoModel;
import org.dubbot.api.service.TangoService;
import org.springframework.stereotype.Component;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;

@Component
public class TangoServiceStub implements TangoService{
    
    private final TangoService tangoLocalService;
    
    //guava缓存
    private static Cache<Integer, List<TangoModel>> dataCache = CacheBuilder.newBuilder()
            .maximumSize(500) //最大缓存数量
                .expireAfterWrite(30, TimeUnit.SECONDS) //30分钟内过期，重新从数据库load
                    .build();
    
    public TangoServiceStub(TangoService tangoService){
        this.tangoLocalService = tangoService;
    }

    @Override
    public List<TangoModel> helloTango(Integer key) {
        List<TangoModel> list = Lists.newArrayList();
        try {
            list = dataCache.get(key, new Callable<List<TangoModel>>() {
                @Override
                public List<TangoModel> call() throws Exception {
                    return tangoLocalService.helloTango(key);
                }
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
        return list;
    }

}
