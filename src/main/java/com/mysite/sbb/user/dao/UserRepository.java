package com.mysite.sbb.user.dao;

import com.mysite.sbb.user.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long> {
}
