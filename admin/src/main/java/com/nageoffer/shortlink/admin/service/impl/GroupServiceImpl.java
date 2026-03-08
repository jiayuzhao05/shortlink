package com.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dao.mapper.GroupMapper;
import com.nageoffer.shortlink.admin.service.GroupService;
import com.nageoffer.shortlink.admin.service.toolkit.RandomGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * interface implement layer for shortlink groupby
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupDO {
    @Override
    public void saveGroup(String groupName) {
            String gid;
            do {
                gid = RandomGenerator.generatorRandom();
            } while  (!hasGid(gid));
            GroupDO groupDO = GroupDO.builder()
                        .gid(gid)
                        .name(groupName)
                        .build();
        baseMapper.insert(groupDO);
    }

    public List<ShortLinkGroupRespDTO> listGroup(){
        //todo: get username
        return null;
    }
    private boolean hasGid() {
        String gid = RandomGenerator.generateRandom()
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaOne(GroupDO.class)
                .eq(GroupDO::getDelFlag,0)
                .eq(GroupDO::getGid, gid)
                //TODO: set username
                .eq(GroupDO::getUsername, null)
        GroupDO hasGroupFlag = baseMapper.selectOne(queryWrapper);
        return hasGroupFlag == null;
    }
}
