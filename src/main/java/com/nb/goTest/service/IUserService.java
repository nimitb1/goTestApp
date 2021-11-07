package com.nb.goTest.service;

import com.nb.goTest.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Interface outlining the requirements for the user service.
 * this service will be used to manage the user data like adding, fetching and updating the user data.
 */
public interface IUserService {

    public Mono<User> addUser(User user);

    public Mono<User> getUserById(String id);

    public Flux<User> getUserByType(String typeOfUser);

    public Mono<User> updateUser(User user);

    public Mono<String> changeActiveStatus(String userId, String status);

}
