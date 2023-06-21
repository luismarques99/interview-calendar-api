package com.lm99.interviewcalendarapi.user;


import com.lm99.interviewcalendarapi.timeslot.TimeSlot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Long id;

    private String firstName;

    private String lastName;

    @Column(
            unique = true
    )
    private String email;

    private String password;

    @Builder.Default
    private Boolean active = false;

    private UserType role;

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "user_time_slots",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "time_slot_id", referencedColumnName = " id")
    )
    private List<TimeSlot> timeSlots;

}
