package springcloudtest.accountservice.repository;

import org.springframework.stereotype.Repository;
import springcloudtest.model.UserEntity;

import java.util.HashMap;
import java.util.Map;

@Repository("userRepository")
public class InMemUserRepository implements UserRepository {
    private Map<Long,UserEntity> entities;

    public InMemUserRepository() {
        entities = new HashMap<Long, UserEntity>();
        UserEntity entity = new UserEntity();
        entity.setUserId(100L);
        entity.setUserName("用户100");
        entity.setNickName("nick100");
        entity.setDefLang("zh-cn");
        entity.setInUse(true);
        entities.put(entity.getUserId(),entity);
        entity = new UserEntity();
        entity.setUserId(200L);
        entity.setUserName("用户200");
        entity.setNickName("nick200");
        entity.setInUse(false);
        entities.put(entity.getUserId(),entity);
    }

    @Override
    public UserEntity get(long id) {
        return entities.get(id);
    }

    @Override
    public int add(UserEntity userEntity) {
        if(!entities.containsKey(userEntity.getUserId())) {
            entities.put(userEntity.getUserId(),userEntity);
            return 1;
        }
        return 0;
    }

    @Override
    public int update(UserEntity userEntity) {
        if(entities.containsKey(userEntity.getUserId())) {
            entities.put(userEntity.getUserId(),userEntity);
            return 1;
        }
        return 0;
    }

    @Override
    public UserEntity remove(long id) {
        return entities.remove(id);
    }
}
