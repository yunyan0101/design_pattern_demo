package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example2;

/**
 * @Project design_pattern_demo
 * @Description 铃声类型枚举
 * @Company youku
 * @Create 2019年09月29日11:51
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public enum RingTypeEnum {
    /**
     *
     */
    BEGINS("begins", "上课"),
    ENDS("ends", "下课"),
    ;

    private String code;
    private String name;

    RingTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
