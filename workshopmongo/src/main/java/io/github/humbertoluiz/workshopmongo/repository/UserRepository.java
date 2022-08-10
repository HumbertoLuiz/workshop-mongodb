package io.github.humbertoluiz.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.github.humbertoluiz.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	
}
