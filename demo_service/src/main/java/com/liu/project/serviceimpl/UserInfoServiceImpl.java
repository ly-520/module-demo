package com.liu.project.serviceimpl;/**
 * @author yonrun
 * @Title: UserInfoServiceImpl
 * @ProjectName moduleProject
 * @Description: TODO
 * @date 2019/7/25 18:13
 */

import com.liu.project.dao.UserInfoDao;
import com.liu.project.entity.UserInfo;
import com.liu.project.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @description
 * @date 2019/7/25
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired// (required = false)
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo queryUserInfo(Integer id) {
        return userInfoDao.queryUserInfo(id);
    }

    @Override
    public List<UserInfo> queryAllUserInfo() {
        return userInfoDao.queryAllUserInfo();
    }



    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return userInfoDao.insertUserInfo(userInfo);
    }

    @Override
    public int deleteUserInfo(Integer id) {
        return userInfoDao.deleteUserInfo(id);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoDao.updateUserInfo(userInfo);
    }
}
