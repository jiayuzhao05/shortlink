package com.nageoffer.shortlink.admin.dao.entity;

import java.util.Date;


/**
 * lasting level for user
 * 
 */
@Data
@TableName("t_user")
public class UserDO {
    /**
     * id
     */
    private Long id;

    /**
     * username
     */
    private String username;

    /**
     * true name
     */
    private String realName;

    /**
     * tel number
     */
    private String phone;

    /**
     * mailbox
     */
    private String mail;
}
