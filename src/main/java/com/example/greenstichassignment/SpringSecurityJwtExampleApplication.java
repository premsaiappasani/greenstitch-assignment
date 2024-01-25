package com.example.greenstichassignment;

import com.example.greenstichassignment.entity.User;
import com.example.greenstichassignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(1001, "user0", "password1", "user1@gmail.com"),
                new User(1002, "user1", "password2", "user1@gmail.com"),
                new User(1003, "user2", "password3", "user2@gmail.com"),
                new User(1004, "user3", "password4", "user3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
