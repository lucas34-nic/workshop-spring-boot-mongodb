package com.lucas34.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas34.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

