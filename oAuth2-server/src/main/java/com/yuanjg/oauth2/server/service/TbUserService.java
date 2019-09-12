package com.yuanjg.oauth2.server.service;

import com.yuanjg.oauth2.server.domain.TbUser;

public interface TbUserService {

    TbUser getByUsername(String userName);
}
