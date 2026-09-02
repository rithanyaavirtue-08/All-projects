package com.zen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zen.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
