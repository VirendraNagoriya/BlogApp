package com.blogApplication.BlogApplication.repository;

import com.blogApplication.BlogApplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository  extends JpaRepository<Role,Long> {


    Optional<Role> findByname(String name);
}
