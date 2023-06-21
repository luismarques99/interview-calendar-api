package com.lm99.interviewcalendarapi.user;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsersByTimeSlotId(Long timeSlotId);

    User getUserById(Long id);

    User getUserByEmail(String email);

    User updateUser(Long id, User updatedUser);

}
