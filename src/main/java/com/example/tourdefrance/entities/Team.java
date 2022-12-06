package com.example.tourdefrance.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    private String teamName;

    @JsonBackReference
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Cyclist> cyclists;


}
