package com.nagarro.tables.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.tables.entity.TimezoneInfo;

public interface TimezoneInfoRepository extends MongoRepository<TimezoneInfo, String>{

}
