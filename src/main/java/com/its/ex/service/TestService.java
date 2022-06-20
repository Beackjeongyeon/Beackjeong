package com.its.ex.service;

import com.its.ex.entity.TestEntity;
import com.its.ex.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    public final TestRepository testRepository;

    public Long save(){
        TestEntity testEntity = new TestEntity();
        testEntity.setColumn1("컴럼"); // 컬럼안에 입력됨
        testEntity.setTestColumn2("컴럼");
        Long id = testRepository.save(testEntity).getId();

        return id;
    }
}
