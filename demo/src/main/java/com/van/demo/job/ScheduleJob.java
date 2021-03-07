package com.van.demo.job;

import com.alibaba.fastjson.JSON;
import com.van.demo.bean.User;
import com.van.demo.dao.UserRepository;
import com.van.demo.redis.JedisUtils;
import com.van.demo.utils.UserGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author: VaN
 * @since: 2021/3/6 11:00
 * @remark: springboot定时任务方式1
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling
public class ScheduleJob implements ApplicationContextAware {

    private Logger logger = LoggerFactory.getLogger(ScheduleJob.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JedisUtils jedisUtils;

    //3.添加定时任务
    @Scheduled(cron = "0/15 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        User user = UserGenerator.getUser();
        logger.info("任务开始");
        User save = userRepository.save(user);
        logger.info("#已经生成用户：" + save.getName());
        jedisUtils.set("VAN_" + save.getId(), JSON.toJSONString(save));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
