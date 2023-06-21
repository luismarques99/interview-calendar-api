package com.lm99.interviewcalendarapi.timeslot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {

    @Query(
            value = "SELECT uts " +
                    "FROM user_time_slots uts " +
                    "  INNER JOIN user as u ON uts.user_id = u.id " +
                    "WHERE u.id = :userId",
            nativeQuery = true
    )
    List<TimeSlot> findAllByUserId(@Param("userId") Long userId);

}
