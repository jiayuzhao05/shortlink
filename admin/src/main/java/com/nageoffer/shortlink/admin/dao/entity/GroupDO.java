package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * shortlink groupby entity
 */
@Data
@TableName("t_group")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDO extends BaseDO {
    /**
     * id
     */
    private Long id;

    /**
     * group name
     */
    private String name;
    /**
     * group id
     */
    private String gid;

    /**
     * create groupby username
     */
    private String username;
    /**
     * sort by group
     */
    private Integer sortOrder;
}
