package com.blw.test.enums;

/**
 * Created by admin on 2017/9/2.
 */
public enum LogTypeEnum {
    TYPE_ACCESS("1"),TYPE_EXCEPTION("2");
    private String label;
    private LogTypeEnum(String label){
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
