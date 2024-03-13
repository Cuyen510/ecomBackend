package ecom.example.ecom.services.auth;


import ecom.example.ecom.dto.SignupRequest;
import ecom.example.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
