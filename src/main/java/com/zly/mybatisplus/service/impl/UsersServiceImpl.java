package com.zly.mybatisplus.service.impl;

import com.zly.mybatisplus.entity.Users;
import com.zly.mybatisplus.mapper.UsersMapper;
import com.zly.mybatisplus.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zly
 * @since 2019-06-24
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
