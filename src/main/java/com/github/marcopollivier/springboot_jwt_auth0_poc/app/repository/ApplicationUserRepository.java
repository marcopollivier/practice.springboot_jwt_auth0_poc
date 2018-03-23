package com.github.marcopollivier.springboot_jwt_auth0_poc.app.repository;

import com.github.marcopollivier.springboot_jwt_auth0_poc.app.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);

}
