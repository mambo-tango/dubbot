package org.dubbot.provider.service;

import org.dubbot.api.service.TangoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;


@Service(version = "1.0.0")
public class TangoServiceImpl implements TangoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TangoServiceImpl.class);
    @Override
    public String helloTango(String key) {
        LOGGER.info("服务端接收到数据 waybillNo：" + key);
        return "1";
    }

}
