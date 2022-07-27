package io.startervalidation.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank(message = "can't be empty")
    @NotNull(message = "is required. Please complete this field to continue.")
    @Size(min = 3, max = 30, message = "is invalid. Please use between 3 and 30 characters")
    String username;

    @NotBlank(message = "can't be empty")
    @Email(message = "is invalid. Please enter a valid email ")
    String email;

    @NotBlank(message = "can't be empty")
    @NotNull(message = "can't be null")
    String bio;

    @NotBlank(message = "can't be empty")
    @NotNull(message = "can't be null")
    @Pattern(regexp = "^((00|\\+)39[\\. ]??)??3\\d{2}[\\. ]??\\d{6,7}$",message = "is invalid. Please enter a valid phone number(es. 3121234567) ")
    String phoneNumber;

    @Min(value = 1, message = "is invalid. Equals to zero or less than zero")
    @Max(value = 100, message = "is invalid. Exceeds 100 years")
    Integer age;
}