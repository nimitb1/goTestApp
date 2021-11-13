package com.nb.goTest.repository;

import com.nb.goTest.entity.Question;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface QuestionRepository extends ReactiveMongoRepository<Question, Integer> {

    @Query(value = "{'instructorId' : ?0}")
    Flux<Question> findByInstructor(String instructorId);
}
