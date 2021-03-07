package com.van.demo.bean;

import com.van.demo.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author: VaN
 * @since: 2021/3/4 22:06
 * @remark:
 */
@Table(name = "t_user")
@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private String sex;

    private String address;

    private String tel;

    private String vipno;

    @Column(name = "create_time")
    private String createTime;

    private String ways;

    private String password;

    public User(  String name, String email, String sex, String address, String tel, String createTime) {
       // this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.address = address;
        this.tel = tel;
        this.createTime = createTime;
    }
}
