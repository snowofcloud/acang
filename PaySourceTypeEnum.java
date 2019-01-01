package com.spring.boot.mybatis.server;

/**
 * @auther xuxq
 * @date 2019/1/1 11:47
 */
public enum PaySourceTypeEnum implements IEnum {
    ALIPAY("ALIPAY","支付宝"),
    WECHAT("WECHAT","微信支付"),
    UNIONPAY("UNIONPAY","银联支付"),;

    //枚举标识码
    private String code;
    //枚举描述
    private String desc;
    //有参构造函数
    PaySourceTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    //
    public static PaySourceTypeEnum getByCode(String code){
        for (PaySourceTypeEnum paySourceTypeEnum: PaySourceTypeEnum.values()) {
            if (paySourceTypeEnum.getCode().equals(code)){
                return paySourceTypeEnum;
            }
        }
        return null;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }




}
