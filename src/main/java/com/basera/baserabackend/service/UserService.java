package com.basera.baserabackend.service;

import com.basera.baserabackend.dtos.LoginRequest;
import com.basera.baserabackend.dtos.RegistrationRequest;
import com.basera.baserabackend.dtos.UserDTO;
import com.basera.baserabackend.entity.User;
import org.apache.catalina.connector.Response;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    Response getOwnAccountDetails();

    User getCurrentLoggedInUser();

    Response updateOwnAccount(UserDTO userDTO);

    Response deleteOwnAccount();

    Response getMyBookingHistory();
}
