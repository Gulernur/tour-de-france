package com.example.tourdefrance.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cyclistId;

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String country;
    private int totalTime;
    private int mountainPoint;
    private int sprintPoint;

    @ManyToOne
    private Team team;
}
