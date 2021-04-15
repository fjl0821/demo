package com.van.demo.service.impl;

import com.van.demo.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: VaN
 * @since: 2021/3/5 10:32
 * @remark:
 */
@Service
public interface BaseServiceImpl <T, ID, R extends JpaRepository<T, ID>> extends BaseService<T, ID> {
}
