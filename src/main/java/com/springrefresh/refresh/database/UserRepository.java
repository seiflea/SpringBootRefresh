package com.springrefresh.refresh.database;

import com.springrefresh.refresh.data.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
