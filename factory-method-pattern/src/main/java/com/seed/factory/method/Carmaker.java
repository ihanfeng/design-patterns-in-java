package com.seed.factory.method;

/**
 * @author HanFeng
 * @version V0.0.1
 * @Title: Carmaker
 * @Package com.seed.factory.method
 * @Description: 汽车制造商
 * @date 2017/8/10
 */
public interface Carmaker {
    /**
     * 制造汽车
     *
     * @param carSeries 汽车系列类型
     * @return 具体汽车
     */
    Car manufactureWeapon(CarSeriesEnum carSeries);
}
