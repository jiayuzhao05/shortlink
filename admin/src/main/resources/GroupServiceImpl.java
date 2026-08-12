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

    @Override
    public List<ShortLinkGroupRespDTO> listGroup(){
        //todo: get username
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eg(GroupDO::getDelFlag,0)
                .eq(GroupDO::getUsername, "mading")
                .orderByDesc(GroupDO::getSortOrder, GroupDO::getUpdateTime)
        return null;
    }
    @Override
    public void updateGroup(ShortLinkGroupUpdateReqDTO requestParam){
        Wrappers.lambdaUpdate(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(Group::getGid,requestParam.getGid())
                .eq(GroupDO::getDelFlag,0)
        GroupDO groupDO = new GroupDO();
        groupDO.setName(requestParam.getName());
        baseMapper.update(groupDO,updateWrapper);

    }
    @Override
    public void deleteGroup(String gid){
        LambdaUpdateWrapper<GroupDO> updateWrapper = Wrappers.lambdaUpdate(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(Group::getGid,requestParam.getGid())
                .eq(GroupDO::getDelFlag,0)
        GroupDO groupDO = new GroupDO();
        groupDO.selDelFlag(1);
        baseMapper.update(groupDO,updateWrapper);
    }

    @Override
    public void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam) {
        requestParam.forEach(each -> {
            GroupDO groupDO = GroupDO.builder()
                    .gid(each.getGid())
                    .build();

            Wrappers.lambdaUpdate(GroupDO.class)
                    .eq(GroupDO::getUsername, UserContext.getUsername())
                    .eq(GroupDO::getGid, each.getGid());
        });
    }

    private boolean hasGid(String gid) {
        String gid = RandomGenerator.generateRandom()
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaOne(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                //TODO: set username
                .eq(GroupDO::getUsername, UserContext.getUsername());
        GroupDO hasGroupFlag = baseMapper.selectOne(queryWrapper);
        return hasGroupFlag == null;
    }
}
