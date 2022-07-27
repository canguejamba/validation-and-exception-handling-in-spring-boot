/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: validation-and-exception-handling-in-spring-boot
 */
package io.startervalidation.request;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {
}
