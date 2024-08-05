package org.faststarter.com.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BizExceptionEnum {

    SYSTEM_ERROR(500, "系统异常！"),
    TOKEN_INVALID(401, "登录过期！请重新登录！"),
    ;

    private Integer code;
    private String message;

}
