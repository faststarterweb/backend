package org.faststarter.com.api.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends RuntimeException {

    private Integer code;

    private String message;

    public BizException() {
        super();
    }

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BizException(String message) {
        super(message);
        this.code = 500;
        this.message = message;
    }

    public BizException(BizExceptionEnum exception) {
        super(exception.getMessage());
        this.code = exception.getCode();
        this.message = exception.getMessage();
    }

}
