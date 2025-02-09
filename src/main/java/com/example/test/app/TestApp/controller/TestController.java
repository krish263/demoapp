package com.example.test.app.TestApp.controller;

import com.example.test.app.TestApp.entity.TestEntity;
import com.example.test.app.TestApp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    public TestEntity save(@RequestBody TestEntity testEntity){
        return testService.save(testEntity);
    }

    @GetMapping
    public List<TestEntity> fetchAll(){
        return testService.fetchAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        testService.deleteById(id);
    }

    @GetMapping
    public TestEntity fetchById(@PathVariable long id){
        return testService.fetchById(id);
    }

    @GetMapping
    public String hello(){
        return "Hi There";
    }
}
