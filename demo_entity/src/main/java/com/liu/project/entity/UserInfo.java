package com.liu.project.entity;/**
 * @author yonrun
 * @Title: UserInfo
 * @ProjectName moduleProject
 * @Description: TODO
 * @date 2019/7/25 18:10
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 * @description
 * @date 2019/7/25
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -1L;

    // -1， 12861238461346L

    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date registerTime;
    private Integer grade;
}
