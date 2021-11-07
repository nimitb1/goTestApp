package com.nb.goTest.service;

import com.nb.goTest.entity.User;
import com.nb.goTest.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO: Need to sanitize the input
 */

@Slf4j
@Service
public class UserService implements IUserService {

    //regex to validate the email
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    //regex to validate the phone number\
    public static final Pattern VALID_PHONE_NUMBER_REGEX =
            Pattern.compile("\\d*");

    @Autowired
    UserRepository userRepository;

    @Override
    public Mono<User> addUser(User user) {
        validateInput(user);
        return userRepository.save(user);
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
    public Mono<User> updateUser(User user) {
        validateInput(user);
        return userRepository.save(user);
    }

    @Override
    public Mono<String> changeActiveStatus(String userId, String status) {
        return null;
    }

    /**
     *  Method to validate the incoming data for the user
     */
    private void validateInput(User user) {
        //The name should not be blank
        if(user.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        //Validate the email
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
        if(!matcher.find()) {
            throw new IllegalArgumentException("Enter the valid email address");
        }
        //validate phone number
        matcher = VALID_PHONE_NUMBER_REGEX.matcher(user.getPhoneNumber());
        if(!matcher.find() || user.getPhoneNumber().length() != 10) {
            throw new IllegalArgumentException("Enter valid 10 digit mobile number");
        }
    }
}
