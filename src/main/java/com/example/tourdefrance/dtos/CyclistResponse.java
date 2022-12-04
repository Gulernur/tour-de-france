package com.example.tourdefrance.dtos;

import com.example.tourdefrance.entities.Cyclist;
import com.example.tourdefrance.entities.Team;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CyclistResponse {

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


    public CyclistResponse(Cyclist cyclist) {
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
