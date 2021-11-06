package com.nb.goTest.repo;

import com.nb.goTest.entity.DbSequence;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DbSequenceRepository extends ReactiveMongoRepository<DbSequence, String> {
}
