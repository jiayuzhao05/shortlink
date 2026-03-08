package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * return entity shortlink group
 */
@Data
public class ShortLinkGroupRespDTO {
        /**
         * group name
         */
        private String name;
        /**
         * group gid
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

