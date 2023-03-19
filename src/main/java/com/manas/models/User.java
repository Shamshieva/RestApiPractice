package com.manas.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_gen")
    @SequenceGenerator(sequenceName = "user_id_seq", name = "user_id_gen", allocationSize = 1)
    private Long id;

    private String image;

    
    private String fullName;

    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Announcement> announcements;

    @OneToMany(cascade = {REFRESH, DETACH, MERGE, PERSIST}, mappedBy = "owner")
    private List<Feedback> feedbacks;
}
