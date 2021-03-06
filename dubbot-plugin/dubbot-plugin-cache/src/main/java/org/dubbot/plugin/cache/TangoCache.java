package org.dubbot.plugin.cache;

import java.util.concurrent.TimeUnit;

import com.alibaba.dubbo.cache.Cache;
import com.alibaba.dubbo.common.URL;
import com.google.common.cache.CacheBuilder;

public class TangoCache implements Cache{
    
    
    //guava缓存
    private final com.google.common.cache.Cache<Object, Object> dataCache;
    

    public TangoCache(URL url) {
            dataCache = CacheBuilder.newBuilder()
                    .maximumSize(500) //最大缓存数量
                    .expireAfterWrite(30, TimeUnit.MINUTES) //30分钟内过期，重新从数据库load
                    .build();
    }
    
    @Override
    public void put(Object key, Object value) {
        dataCache.put(key, value);
        
    }

    @Override
    public Object get(Object key) {
        Object obj = null;
        obj = dataCache.getIfPresent(key);
      
      return obj;
    }

}
