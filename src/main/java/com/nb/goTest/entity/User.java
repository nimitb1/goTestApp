package com.nb.goTest.entity;

import com.mongodb.lang.NonNull;
import com.nb.goTest.utils.Role;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class will hold the user related information.
 * The id field will hold the employee id for the instructors and student roll number for the students.
 */

@Data
@Document(collection = "users_db")
public class User {

    @Id
    private String id;
    private String name;
    private Role role;
    private String email;
    private String phoneNumber;
    private String status;
    private String userName;
    private String password;
    private boolean firstLogin;
}
