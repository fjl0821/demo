package com.van.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * @author: VaN
 * @since: 2021/3/5 20:16
 * @remark:
 */

@Component
public class JedisUtils {
    @Autowired
    private JedisPool jedisPool;


    public void set(String key, String value) {
        jedisPool.getResource().set(key, value);
    }

    public String get(String key) {
        return jedisPool.getResource().get(key);
    }

}
