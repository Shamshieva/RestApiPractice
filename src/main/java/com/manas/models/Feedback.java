package com.manas.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> image;

    private Integer rating;

    private String description;

    private LocalDate createdAt;

    @ManyToOne(cascade = {DETACH, PERSIST, REFRESH, MERGE})
    private Announcement announcement;

    @ManyToOne(cascade = {DETACH, PERSIST, REFRESH, MERGE})
    private User owner;
}
