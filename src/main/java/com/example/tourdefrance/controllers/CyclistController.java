package com.example.tourdefrance.controllers;

import com.example.tourdefrance.dtos.CyclistResponse;
import com.example.tourdefrance.services.CyclistService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cyclists")
@CrossOrigin
public class CyclistController {
    CyclistService cyclistService;

    public CyclistController(CyclistService cyclistService) {
        this.cyclistService = cyclistService;
    }

    @GetMapping
    public List<CyclistResponse> getAllCyclist(){
        List<CyclistResponse> response = cyclistService.getAllCyclists();
        return  response;
    }
}
