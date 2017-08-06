package springcloudtest.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloudtest.accountservice.repository.UserRepository;
import springcloudtest.model.UserEntity;

@Service("userService")
public class UserService implements IUserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity get(long id) {
        return userRepository.get(id);
    }

    @Override
    public int add(UserEntity t) {
        return userRepository.add(t);
    }

    @Override
    public int update(UserEntity t) {
        return userRepository.update(t);
    }

    @Override
    public UserEntity remove(long id) {
        return userRepository.remove(id);
    }
}
