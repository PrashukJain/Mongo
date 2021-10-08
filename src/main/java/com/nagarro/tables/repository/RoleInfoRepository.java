package com.nagarro.tables.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.tables.entity.RoleInfo;

public interface RoleInfoRepository extends MongoRepository<RoleInfo, String> {

}
