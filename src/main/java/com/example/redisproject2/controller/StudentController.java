package com.example.redisproject2.controller;

import com.example.redisproject2.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    RedisTemplate<String, Student> redisTemplate;
    @PostMapping("/string/person")
    public void savePerson(@RequestBody Student person) {

        String key = String.valueOf(person.getId());
        redisTemplate.opsForValue().set(key,person);

    }
    @GetMapping("/string/persons")
    public Student getPerson(@RequestParam("id") long id){
        Student person = redisTemplate.opsForValue().get(String.valueOf(id));
        return person;
    }
}
