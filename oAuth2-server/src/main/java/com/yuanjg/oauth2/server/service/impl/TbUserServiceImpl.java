package com.yuanjg.oauth2.server.service.impl;

import com.yuanjg.oauth2.server.domain.TbUser;
import com.yuanjg.oauth2.server.mapper.TbUserMapper;
import com.yuanjg.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String userName) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", userName);
        return tbUserMapper.selectOneByExample(example);
    }
}
