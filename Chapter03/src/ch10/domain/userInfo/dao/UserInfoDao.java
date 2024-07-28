package ch10.domain.userInfo.dao;

import ch10.domain.userInfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);
}
