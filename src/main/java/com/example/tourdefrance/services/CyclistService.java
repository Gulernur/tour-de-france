package com.example.tourdefrance.services;

import com.example.tourdefrance.dtos.CyclistRequest;
import com.example.tourdefrance.dtos.CyclistResponse;
import com.example.tourdefrance.entities.Cyclist;
import com.example.tourdefrance.repositories.CyclistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CyclistService {
    CyclistRepository cyclistRepository;

    public CyclistService(CyclistRepository cyclistRepository) {
        this.cyclistRepository = cyclistRepository;
    }

    public List<CyclistResponse> getAllCyclists(){
        List<Cyclist> cyclists = cyclistRepository.findAll();
        List<CyclistResponse> response = cyclists.stream().map(cyclist ->
                new CyclistResponse(cyclist)).collect(Collectors.toList());
        return response;
    }

    public CyclistResponse addCyclist(CyclistRequest cyclistRequest){
        Cyclist cyclist = CyclistRequest.getCyclistEntity(cyclistRequest);
        cyclist = cyclistRepository.save(cyclist);
        return new CyclistResponse(cyclist);
    }
}
