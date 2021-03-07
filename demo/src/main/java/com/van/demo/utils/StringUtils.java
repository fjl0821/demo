package com.van.demo.utils;

import java.util.UUID;

public class StringUtils {


    public static String getUUid() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }


    public static void main(String[] args) {
        System.out.println(getUUid());
    }


}
