package com.SpringApi.RestApi.Repo;

import com.SpringApi.RestApi.User.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Integer> {
}
