package com.van.demo.service.impl;

import com.van.demo.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: VaN
 * @since: 2021/3/5 10:32
 * @remark:
 */
public interface BaseServiceImpl <T, ID, R extends JpaRepository<T, ID>> extends BaseService<T, ID> {
}
