package com.van.demo.dao;

import com.van.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: VaN
 * @since: 2021/3/4 22:09
 * @remark:
 */
public interface  UserRepository extends JpaRepository<User,Integer> {
}
