package io.startervalidation.request;

import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository repository) {
    public User saveUser(UserRequestDTO userRequest) {

        User user = User.builder()
                .username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .bio(userRequest.getBio())
                .phoneNumber(userRequest.getPhoneNumber())
                .age(userRequest.getAge())
                .build();


        return  repository.save(user);
    }
}
