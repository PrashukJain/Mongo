package com.nagarro.tables.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.tables.entity.User;


public interface UserRepository extends MongoRepository<User, String>{

}
