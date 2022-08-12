package com.user.controller;

import com.user.enitity.Contact;
import com.user.enitity.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users")
    public List<User> getAllTeams()
    {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserbyID(@PathVariable("id") int id)
    {
        User user = userRepository.getById(id);
        List contacts= restTemplate.getForObject("http://localhost:9006/contacts/"+ id, List.class);
        user.setContacts(contacts);
        return user;
        //user.setContacts(contacts);
        //return responseBody;
    }

    @PostMapping("/teams")
    public User createTeam(@RequestBody User user)
    {
        return userRepository.save(user);
    }
}
