package com.lm99.interviewcalendarapi.timeslot;

import java.time.LocalDateTime;

public record TimeSlotUserResponseDTO(

        LocalDateTime startTime,

        LocalDateTime endTime

) {
}
