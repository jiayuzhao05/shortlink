package com.nageoffer.shortlink.admin.controller;

import org.springframework.web.bind.annotation.RestController;
/*
* user control managemnet level
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    /**
     *
     * search user info through account name
     */
    @GatMapping("/api/shortlink/v1/user/{username}")
    public String getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        if(result==null){
            return new Result<UserRespDTO>().setCode("-1").setMessage("search result is null")
        } else {
            return new Result<UserRespDTO>().setCode("0").setData(result)
        }
        
    }
}
