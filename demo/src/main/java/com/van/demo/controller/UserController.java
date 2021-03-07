package com.van.demo.controller;

import com.alibaba.fastjson.JSON;
import com.van.demo.bean.User;
import com.van.demo.dao.UserRepository;
import com.van.demo.redis.JedisUtils;
import com.van.demo.utils.UserGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author: VaN
 * @since: 2021/3/4 22:10
 * @remark:
 */
@RestController
@RequestMapping(path = "user")
public class UserController {

    private final String USER_PRE = "VAN_";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JedisUtils jedisUtils;


    @GetMapping(path = "test")
    public void test() {
        User u = UserGenerator.getUser();
        System.out.println(u.getAddress());
        User save = userRepository.save(u);
        String s = JSON.toJSONString(save);
        jedisUtils.set(USER_PRE + save.getId(), JSON.toJSONString(save));
        System.out.println("!!!");
    }

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @PostMapping(path = "user", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User addNewUser(@RequestBody User user) {
        User u = UserGenerator.getUser();
        return userRepository.save(u);
    }

    /**
     * 根据分页信息查询用户
     *
     * @param request
     * @return
     */
    @GetMapping(path = "users")
    @ResponseBody
    public Page<User> getAllUsers(Pageable request) {
        return userRepository.findAll(request);
    }
}
