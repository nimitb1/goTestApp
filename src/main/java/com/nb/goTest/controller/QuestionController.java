package com.nb.goTest.controller;

import com.nb.goTest.entity.Question;
import com.nb.goTest.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    IQuestionService questionService;

    @PostMapping("/save/{instructorId}")
    Mono<Question> save(@PathVariable String instructorId, @RequestBody Question question) {
        return questionService.add(question, instructorId);
    }

    @GetMapping("/fetchAll")
    Flux<Question> findAll(){
        return questionService.findAll();
    }

}
