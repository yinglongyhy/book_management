package cn.scau.db.bookmanagement;

import cn.scau.db.bookmanagement.entity.User;
import cn.scau.db.bookmanagement.mapper.UserMapper;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class BookmanagementApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    UserMapper userMapper;

    @Test
    public void test1() {
        System.out.println(userMapper);
        User user = new User();
        user.setIdCard("44088319970220131x");
        user.setAccount("aaa");
        user.setPassword("bbb");
        user.setName("ccc");
        user.setCreateBy(LocalDateTime.now());
        user.setModifyBy(LocalDateTime.now());
        try {
            userMapper.insert(user);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<User> users = userMapper.selectList(null);
        System.out.println(new Gson().toJson(users));

    }

}
