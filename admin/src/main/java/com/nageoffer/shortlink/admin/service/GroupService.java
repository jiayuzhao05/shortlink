package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;


/**
 * interface layer for shortlink groupby
 */
public interface GroupService extends IService<GroupDO> {
    /**
     * append group
     * @param groupName 短链接分组
     */
    void saveGroup(String groupName);

    /**
     * seearch user groupby set
     * @return
     */
    List<ShortLinkGroupRepDTO> listGroup();

    /**
     * modify groupby
     * @param requestParam
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam)

    /**
     * delete groupby
     * @param gid shortlink groupby
     */
    void deleteGroup(String gid);

    /**
     * sort groupby
     * @param requestParam
     */
    void sortGroup(List<ShortLinkGroupSOrtReqDTO> requestParam)
}
