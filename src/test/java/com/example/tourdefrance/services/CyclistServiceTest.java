package com.example.tourdefrance.services;

import com.example.tourdefrance.entities.Cyclist;
import com.example.tourdefrance.entities.Team;
import com.example.tourdefrance.repositories.CyclistRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CyclistServiceTest {

    public static CyclistRepository cyclistRepository;
    public CyclistService cyclistService;

    @BeforeAll
    public static void initTestData(@Autowired CyclistRepository cyclist_Repository){
        cyclistRepository = cyclist_Repository;
        cyclistRepository.deleteAll();
    }

    @Test
    void getAllCyclists() {
    }
}