package com.demo.controller;

import com.demo.config.Swagger2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "用户管理相关接口")
@RestController // springboot 提供了http refult风格，这个注解 等同于 Controller每个方法加上@ResponseBody
@RequestMapping("/com/mydemo")
public class UserController extends Swagger2 {

    @ApiOperation(value = "接口的功能介绍",notes = "提示接口使用者注意事项",httpMethod = "GET")
    @ApiImplicitParam(dataType = "string",name = "name",value = "姓名",required = true)
    @RequestMapping(value = "/")
    public String index(String name) {

        return "hello "+ name;
    }
}
