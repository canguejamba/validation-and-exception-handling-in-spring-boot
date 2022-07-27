/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: validation-and-exception-handling-in-spring-boot
 */
package io.startervalidation.request;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String email;
    String bio;
    String phoneNumber;
    int age;

}
