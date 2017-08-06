package springcloudtest.accountservice.repository;

/**
 * Created by feng on 2017/8/6.
 */
public interface CrudRepository<T> extends ReadOnlyRepository<T> {
    int add(T t);
    int update(T t);
    T remove(long id);
}
