package com.liu.project.dao;

import com.liu.project.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yonrun
 * @Title: UserInfoDao
 * @ProjectName moduleProject
 * @Description: TODO
 * @date 2019/7/25 18:11
 */
@Repository
public interface UserInfoDao {

    /**
     *功能描述 查询所有用户信息
     * @author  ljt
     * @date
     * @param
     * @return List<UserInfo>
     */
    public List<UserInfo> queryAllUserInfo();

    /**
     *功能描述 查询单个用户信息
     * @author  ljt
     * @date
     * @param
     * @return UserInfo
     */
    public UserInfo queryUserInfo(Integer id);

    /**
     *功能描述  添加用户信息
     * @author ljt
     * @date
     * @param   userInfo
     * @return int
     */
    public int insertUserInfo(UserInfo userInfo);


    /**
     *功能描述  删除用户
     * @author ljt
     * @date
     * @param   id
     * @return
     */
    public int deleteUserInfo(Integer id);

    /**
     *功能描述  修改用户信息
     * @author ljt
     * @date
     * @param  userInfo
     * @return
     */
    public int updateUserInfo(UserInfo userInfo);

}
