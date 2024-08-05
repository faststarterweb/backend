package org.faststarter.com.api.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.faststarter.com.api.data.vo.ActionResult;
import org.faststarter.com.api.exception.BizException;
import org.faststarter.com.api.exception.BizExceptionEnum;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class DefaultGlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ActionResult exceptionHandler(Exception e) {
        log.error("", e);
        if (e instanceof BizException) {
            return ActionResult.fail((BizException) e);
        }
        return ActionResult.fail(new BizException(BizExceptionEnum.SYSTEM_ERROR));
    }

}
