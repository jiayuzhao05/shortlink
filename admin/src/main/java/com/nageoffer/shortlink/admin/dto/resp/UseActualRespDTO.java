package com.nageoffer.shortlink.admin.dto.resp;

public Result<UserActualRespDTO> getActualUserByname(@PathgVariable("username")class UseActualRespDTO {
    return Results.success(BeanUtil/toBean(userService.getUserByUsername(username)))
}
