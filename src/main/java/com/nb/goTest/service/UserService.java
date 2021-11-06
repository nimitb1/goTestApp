package com.nb.goTest.service;

import com.nb.goTest.entity.User;
import com.nb.goTest.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * TODO: Need to sanitize the input
 */

@Slf4j
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Mono<User> addUser(User user) {
//        boolean isError = false;
//        try {
//            validateInput(user);
            return userRepository.save(user);
//        } catch (IllegalArgumentException iae) {
//            log.error("An error occurred while adding the user: " + iae.getMessage() );
//            isError = true;
//        }
//        if(isError) {
//            return Mono.just("Unable to add the user");
//        }
//        return Mono.just("User Added Successfully");
    }

    @Override
    public Mono<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Flux<User> getUserByType(String typeOfUser) {
        return null;
    }

    @Override
    public Mono<String> updateUser(User user) {
        boolean isError = false;
        try {
            validateInput(user);
            userRepository.save(user);
        } catch (IllegalArgumentException iae) {
            log.error("An error occurred while updating the user: " + iae.getMessage() );
            isError = true;
        }
        if(isError) {
            return Mono.just("Unable to update the user");
        }
        return Mono.just("User updated Successfully");
    }

    @Override
    public Mono<String> changeActiveStatus(String userId, String status) {
        return null;
    }

    /**
     *  Method to validate the incoming data for the user
     */
    private void validateInput(User user) {
        if(user.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
    }
}
