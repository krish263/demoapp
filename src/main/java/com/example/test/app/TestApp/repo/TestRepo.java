package com.example.test.app.TestApp.repo;

import com.example.test.app.TestApp.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestEntity,Long> {

}
