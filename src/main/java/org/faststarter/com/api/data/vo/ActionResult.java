package org.faststarter.com.api.data.vo;

import lombok.Data;
import org.faststarter.com.api.exception.BizException;

@Data
public class ActionResult {

    private int code = 200;
    private boolean success = true;
    private String errorMessage;
    private Object data;

    public static ActionResult success() {
        return new ActionResult();
    }

    public static ActionResult success(Object data){
        ActionResult rs = new ActionResult();
        rs.setCode(200);
        rs.setSuccess(true);
        rs.setData(data);
        return rs;
    }

    public static ActionResult fail(String errorMsg){
        ActionResult rs = new ActionResult();
        rs.setCode(500);
        rs.setSuccess(false);
        rs.setErrorMessage(errorMsg);
        return rs;
    }

    public static ActionResult fail(BizException exception){
        ActionResult rs = new ActionResult();
        rs.setCode(exception.getCode());
        rs.setSuccess(false);
        rs.setErrorMessage(exception.getMessage());
        return rs;
    }

}
