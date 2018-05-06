package org.dubbot.plugin.cache;

import java.io.Serializable;

public class TangoModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer shipId;
    private Long mallId;
    private Boolean flag;
    
    public Integer getShipId() {
        return shipId;
    }
    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }
    public Long getMallId() {
        return mallId;
    }
    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
    public Boolean getFlag() {
        return flag;
    }
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
