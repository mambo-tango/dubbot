package org.dubbot.provider.service;

import java.util.List;

import org.dubbot.api.service.TangoService;
import org.dubbot.plugin.cache.TangoModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
public class TangoServiceImpl implements TangoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TangoServiceImpl.class);
    @Override
    public List<TangoModel> helloTango(Integer key) {
        LOGGER.info("服务端接收到数据 shipId：" + key);
        List<TangoModel> list = Lists.newArrayList();
        switch(key) {
            case 1:
                TangoModel t1 = new TangoModel();
                t1.setMallId(1L);
                t1.setShipId(1);
                t1.setFlag(true);
                list.add(t1);
                break;
            case 2:
                TangoModel t2 = new TangoModel();
                t2.setMallId(2L);
                t2.setShipId(2);
                t2.setFlag(true);
                list.add(t2);
                TangoModel t22 = new TangoModel();
                t22.setMallId(22L);
                t22.setShipId(22);
                t22.setFlag(false);
                list.add(t22);
                break;
            case 3:
                TangoModel t3 = new TangoModel();
                t3.setMallId(3L);
                t3.setShipId(3);
                t3.setFlag(true);
                list.add(t3);
                break;
            case 4:
                TangoModel t4 = new TangoModel();
                t4.setMallId(4L);
                t4.setShipId(4);
                t4.setFlag(true);
                list.add(t4);
                break;
            case 5:
                TangoModel t5 = new TangoModel();
                t5.setMallId(5L);
                t5.setShipId(5);
                t5.setFlag(true);
                list.add(t5);
                TangoModel t55 = new TangoModel();
                t55.setMallId(55L);
                t55.setShipId(55);
                t55.setFlag(true);
                list.add(t55);
                TangoModel t555 = new TangoModel();
                t555.setMallId(555L);
                t555.setShipId(555);
                t555.setFlag(true);
                list.add(t555);
                break;
            default:
                break;
                
        }
        return list;
    }

}
