package com.elpandor.userproject.repository;

import com.elpandor.userproject.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<Users, Integer> {
}
