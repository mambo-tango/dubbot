package org.dubbot.api.service;

import java.util.List;

import org.dubbot.plugin.cache.TangoModel;

public interface TangoService {
    
    /**
     * 
     * @param key
     * @return
     */
    List<TangoModel> helloTango(Integer key);
}
