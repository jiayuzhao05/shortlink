package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.dao.mapper.GroupMapper;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller layer for groupby
 */
@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupMapper groupMapper;
}
