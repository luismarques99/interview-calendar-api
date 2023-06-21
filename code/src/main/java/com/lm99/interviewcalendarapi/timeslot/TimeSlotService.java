package com.lm99.interviewcalendarapi.timeslot;

import java.util.List;

public interface TimeSlotService {

    TimeSlot createTimeSlot(TimeSlot timeSlot);

    List<TimeSlot> getAllTimeSlotsByUserId(Long userId);

    TimeSlot getTimeSlotById(Long id);

}
