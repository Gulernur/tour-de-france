package com.example.tourdefrance.dtos;

import com.example.tourdefrance.entities.Cyclist;
import com.example.tourdefrance.entities.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CyclistRequest {

    private Long cyclistId;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String country;
    private int totalTime;
    private int mountainPoint;
    private int sprintPoint;
    private Team team;

    public static Cyclist getCyclistEntity(CyclistRequest cyclistRequest){
        return Cyclist.builder()
                .cyclistId(cyclistRequest.getCyclistId())
                .firstName(cyclistRequest.getFirstName())
                .middleName(cyclistRequest.getMiddleName())
                .lastName(cyclistRequest.getLastName())
                .age(cyclistRequest.getAge())
                .country(cyclistRequest.getCountry())
                .totalTime(cyclistRequest.getTotalTime())
                .mountainPoint(cyclistRequest.getMountainPoint())
                .sprintPoint(cyclistRequest.getSprintPoint())
                .team(cyclistRequest.getTeam())
                .build();
    }

    public CyclistRequest(Cyclist cyclist) {
        this.cyclistId = cyclist.getCyclistId();
        this.firstName = cyclist.getFirstName();
        this.middleName = cyclist.getMiddleName();
        this.lastName = cyclist.getLastName();
        this.age = cyclist.getAge();
        this.country = cyclist.getCountry();
        this.totalTime = cyclist.getTotalTime();
        this.mountainPoint = cyclist.getMountainPoint();
        this.sprintPoint = cyclist.getSprintPoint();
        this.team = cyclist.getTeam();
    }
}
