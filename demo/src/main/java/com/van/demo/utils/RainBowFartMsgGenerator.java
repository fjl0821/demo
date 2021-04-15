package com.van.demo.utils;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: VaN
 * @since: 2021/3/17 21:47
 * @remark: 彩虹p信息生成器
 */
public class RainBowFartMsgGenerator {

    private static Logger logger = LoggerFactory.getLogger(RainBowFartMsgGenerator.class);

    public static String getMsgFromRain() {
        try {
            //创建客户端对象
            HttpClient client = HttpClients.createDefault();
            HttpGet get = new HttpGet("https://chp.shadiao.app/api.php");
            HttpResponse response = client.execute(get);
            HttpEntity entity = response.getEntity();
            //通过HTTP实体工具类，转换响应体数据
            String responseString = EntityUtils.toString(entity, "utf-8");
            logger.info("生成邮件信息：{}", responseString);
            return responseString;
        } catch (Exception e) {
            logger.error("网站获取句子失败：", e.getMessage());
            throw new RuntimeException("网站获取句子失败");
        }
    }

}
