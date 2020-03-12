package cn.scau.db.bookmanagement.service.impl;

import cn.scau.db.bookmanagement.entity.Admin;
import cn.scau.db.bookmanagement.mapper.AdminMapper;
import cn.scau.db.bookmanagement.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
