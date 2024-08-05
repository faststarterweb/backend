package org.faststarter.com.api.controller;

import org.faststarter.com.api.data.form.GenerateForm;
import org.faststarter.com.api.data.vo.ActionResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faststarter")
public class ResourceController {

    @GetMapping("/dependencies")
    public ActionResult dependencies(@RequestParam("sign") String sign) {
        return ActionResult.success();
    }

    @PostMapping("/generate")
    public ActionResult generate(@RequestBody @Validated GenerateForm generate) {
        return ActionResult.success();
    }
}
