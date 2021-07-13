package io.swagger.petstore.certification.utils.enums;

public enum URLReqRes {
    URI_BASE("https://petstore.swagger.io/v2"),
    URI_SUFFIX_USERS("user"),
    URI_SUFFIX_PlOrder("store/order");


    private String _value;

    URLReqRes(String value) {
        _value = value;
    }


    public String getValue() {
        return _value;
    }
}
