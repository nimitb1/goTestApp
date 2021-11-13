package com.nb.goTest.repository;

import com.nb.goTest.entity.StudentQuizMap;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentQuizMapRepository extends ReactiveMongoRepository<StudentQuizMap, String> {
}
