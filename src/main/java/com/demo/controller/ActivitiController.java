package com.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: zhangjie on 2020/9/1 0001 上午 10:47
 *@param:
 *@return:
 *@Description: 工作流
 */
@Api(tags = "工作流")
@RestController // springboot 提供了http refult风格，这个注解 等同于 Controller每个方法加上@ResponseBody
@RequestMapping("/com/myactiviti")
public class ActivitiController {

    @ApiOperation(value = "创建流程",notes = "提示接口使用者注意事项",httpMethod = "POST")
    @ApiImplicitParam(dataType = "string",name = "name",value = "姓名",required = true)
    @PostMapping(value = "/create")
    public String create(String name) {
        return "hello "+ name;
    }
}
