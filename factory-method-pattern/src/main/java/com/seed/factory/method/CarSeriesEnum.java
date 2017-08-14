package com.seed.factory.method;

/**
 * @author HanFeng
 * @version V0.0.1
 * @Title: CarSeriesEnum
 * @Package com.seed.factory.method
 * @Description: 汽车系列型号枚举
 * @date 2017/8/10
 */
public enum CarSeriesEnum {
    BMW_SERIES_730("730", "宝马730系列"),
    BMW_SERIES_740("740", "宝马740系列"),
    BMW_SERIES_750("750", "宝马750系列"),
    BMW_SERIES_760("760", "宝马760系列");

    private final String value;
    private final String label;

    CarSeriesEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 获取值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取标签
     *
     * @return
     */
    public String getLabel() {
        return label;
    }
}
