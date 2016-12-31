package com.github.zzycjcg.springboot.web.constant;

/**
 * Created by user on 12/31/16.
 */
public enum ErrorCode {
    E000000001("000000001", "Not login");

    private final String code;
    private final String msg;

    private ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return new StringBuilder("code=").
                append(code).append(", msg=").append(msg).toString();
    }
}
