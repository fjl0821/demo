package com.van.demo;

import com.van.demo.bean.User;
import com.van.demo.dao.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

/**
 * @author: VaN
 * @since: 2021/3/5 8:49
 * @remark:
 */
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testSaveUser(){

//        User u  = new User();
//        u.setId("123");
//        u.setName("test");
//        User save = userRepository.save(u);
//        System.out.println("####success:"+save);
    }
}
