package com.nb.goTest.service;

import com.nb.goTest.entity.DbSequence;
import com.nb.goTest.entity.Question;
import com.nb.goTest.repo.DbSequenceRepository;
import com.nb.goTest.repo.QuestionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * TODO: Add the validations for the input
 */
@Slf4j
@Service
public class QuestionService implements IQuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    DbSequenceRepository sequenceRepository;

    @Override
    public Mono<Question> add(Question question, String instructorId) {
        Mono<DbSequence> sequence = sequenceRepository.findById(Question.SEQUENCE_NAME).switchIfEmpty(Mono.empty());
        DbSequence seq = sequence.block();
        String questionId = instructorId;
        if(seq == null) {
            throw new IllegalArgumentException("Sequence type " + Question.SEQUENCE_NAME + " does not exist");
        } else {
            int id = seq.getSequenceNo() + 1;
            seq.setSequenceNo(id);
            sequenceRepository.save(seq);
            questionId += id;
        }
        question.setId(questionId);
        return questionRepository.save(question);
    }

    @Override
    public Flux<Question> fetchByDifficulty(String difficulty) {
        return null;
    }

    @Override
    public Flux<Question> fetchByType(String type) {
        return null;
    }

    @Override
    public Flux<Question> fetchByInstructor(String instructorId) {
        return null;
    }

    @Override
    public Flux<Question> findAll() {
        return questionRepository.findAll();
    }
}
