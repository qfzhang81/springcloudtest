package springcloudtest.accountservice.service;

import springcloudtest.model.UserEntity;

/**
 * Created by feng on 2017/8/6.
 */
public interface IUserService {
    UserEntity get(long id);
    int add(UserEntity t);
    int update(UserEntity t);
    UserEntity remove(long id);
}
