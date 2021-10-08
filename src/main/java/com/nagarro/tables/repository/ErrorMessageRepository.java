package com.nagarro.tables.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.tables.entity.ErrorMessage;

public interface ErrorMessageRepository extends MongoRepository<ErrorMessage, String> {

}
