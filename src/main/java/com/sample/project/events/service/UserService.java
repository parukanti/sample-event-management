package com.sample.project.events.service;

import com.sample.project.events.persist.entity.PasswordResetToken;
import com.sample.project.events.persist.entity.User;
import com.sample.project.events.persist.entity.VerificationToken;

public interface UserService {

    //User registerNewUserAccount(UserDto accountDto)
    //        throws EmailExistsException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void createVerificationToken(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordResetToken getPasswordResetToken(String token);

    User getUserByPasswordResetToken(String token);

    User getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);
}
