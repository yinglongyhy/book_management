package cn.scau.db.bookmanagement.service.impl;

import cn.scau.db.bookmanagement.entity.User;
import cn.scau.db.bookmanagement.mapper.UserMapper;
import cn.scau.db.bookmanagement.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yinglongyhy
 * @since 2020-03-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
