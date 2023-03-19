package com.manas.models;

import com.manas.enums.HouseType;
import com.manas.enums.Region;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> images;

    @Enumerated(EnumType.STRING)
    private HouseType houseType;

    @Enumerated(EnumType.STRING)
    private Region region;

    private String title;
    private String description;

    private Integer maxOfGuests;

    private BigDecimal price;

    private String city;

    private String address;

    private Double rating;

    private LocalDate createdAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "announcement")
    private List<Feedback> feedbacks;

    @ManyToOne(cascade = {PERSIST, REFRESH,MERGE,DETACH})
    private User owner;
}
