package com.example.tourdefrance.controllers;

import com.example.tourdefrance.dtos.CyclistRequest;
import com.example.tourdefrance.dtos.CyclistResponse;
import com.example.tourdefrance.services.CyclistService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public CyclistResponse addCyclist(@RequestBody CyclistRequest body){
        return cyclistService.addCyclist(body);
    }
}
