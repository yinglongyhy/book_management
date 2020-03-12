package cn.scau.db.bookmanagement.service.impl;

import cn.scau.db.bookmanagement.entity.Book;
import cn.scau.db.bookmanagement.mapper.BookMapper;
import cn.scau.db.bookmanagement.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
