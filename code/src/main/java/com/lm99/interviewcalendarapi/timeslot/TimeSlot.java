package com.lm99.interviewcalendarapi.timeslot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TimeSlot {

    @Id
    @SequenceGenerator(
            name = "time_slot_id_sequence",
            sequenceName = "time_slot_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "time_slot_id_sequence"
    )
    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

}
