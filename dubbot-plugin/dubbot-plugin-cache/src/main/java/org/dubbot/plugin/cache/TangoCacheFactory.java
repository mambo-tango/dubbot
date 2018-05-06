package org.dubbot.plugin.cache;

import com.alibaba.dubbo.cache.Cache;
import com.alibaba.dubbo.cache.support.AbstractCacheFactory;
import com.alibaba.dubbo.common.URL;

public class TangoCacheFactory extends AbstractCacheFactory{

    @Override
    protected Cache createCache(URL url) {
        return new TangoCache(url);
    }


}
