package com.lm99.interviewcalendarapi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    List<User> findByRole(UserType role);

    @Query(
            value = "SELECT u " +
                    "FROM user as u " +
                    "  INNER JOIN user_time_slots uts ON u.id = uts.user_id " +
                    "WHERE uts.id = :timeSlotId",
            nativeQuery = true
    )
    List<User> findAllByTimeSlotId(@Param("timeSlotId") Long timeSlotId);

}
