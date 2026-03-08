package com.nageoffer.shortlink.admin.common.database;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * basic feature for object in database lasting layer
 */
@Data
public class BaseDO {
    /**
     * create time
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * modify time
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * delete flag 0: not delete 1: deleted
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}
