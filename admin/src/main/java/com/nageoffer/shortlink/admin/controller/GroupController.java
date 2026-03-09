package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.common.convention.result.Results;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.nageoffer.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * controller layer for groupby
 */
@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupMapper groupMapper;

    /**
     * append group
     * @return
     */
    @PostMapping("/api/shortlink/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam){
        groupService.saveGroup(requestParam.getname());
        return Results.success()
    }

    /**
     * search group assembly
     * @return
     */
    @getMapping("/api/shortlink/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> ListGroup() {
        return Results.success( groupService.listGroup());
    }

    @PutMapping("/api/shortlink/v1/group")
    public Result<Void> updateGroup(@RequestBody SHortLinkGroupUpdateReqDTO request ){
        groupService.updateGroup(requestParam);
        return Results.succeess()
    }

    /**
     * delete groupby name
     */
    @PutMapping("/api/shortlink/v1/group")
    public Result<Void> deleteGroup(@RequestBody String gid){
        groupService.deleteGroup(requestParam);
        return Results.success();
    }

    @PutMapping("/api/shortlink/v1/group")
    public Result<Void> sortGroup(@RequestBody String gid){
        groupService.deleteGroup(requestParam);
        return Results.success();
    }

}
