package springcloudtest.accountservice.repository;

/**
 * Created by feng on 2017/8/6.
 */
public interface ReadOnlyRepository<T> {
    T get(long id);
}
