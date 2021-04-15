package com.van.demo.annotation;

import java.lang.annotation.*;

/**
 * @author: VaN
 * @since: 2021/4/15 11:31
 * @remark: 自定义事务注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface CustmonTransaction {

    String value() default "VaN";

}
