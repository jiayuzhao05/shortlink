package com.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dao.mapper.GroupMapper;
import com.nageoffer.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * interface implement layer for shortlink groupby
 */
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupDO {

}
