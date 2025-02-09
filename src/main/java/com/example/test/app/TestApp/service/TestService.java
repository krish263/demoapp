package com.example.test.app.TestApp.service;

import com.example.test.app.TestApp.entity.TestEntity;
import com.example.test.app.TestApp.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    public List<TestEntity> fetchAll(){
        return testRepo.findAll();
    }

    public TestEntity fetchById(long id){
        return testRepo.findById(id).get();
    }

    public void deleteById(long id){
        testRepo.deleteById(id);
    }

    public TestEntity save(TestEntity testEntity){
        return testRepo.save(testEntity);
    }
}
