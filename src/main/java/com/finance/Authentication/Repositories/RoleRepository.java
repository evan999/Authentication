package com.finance.Authentication.Repositories;

import com.finance.Authentication.Models.ERole;
import com.finance.Authentication.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
