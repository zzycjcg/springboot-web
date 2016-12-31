package com.github.zzycjcg.springboot.web.exception;

import com.github.zzycjcg.springboot.web.constant.ErrorCode;

/**
 * Created by user on 12/31/16.
 */
public class WebRuntimeException extends RuntimeException {
    private final ErrorCode errorCode;

    public WebRuntimeException(ErrorCode errorCode) {
        super(errorCode.toString());
        this.errorCode = errorCode;
    }

    public WebRuntimeException(ErrorCode errorCode, Throwable t) {
        super(errorCode.toString(), t);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
