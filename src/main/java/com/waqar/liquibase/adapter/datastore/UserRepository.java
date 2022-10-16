package com.waqar.liquibase.adapter.datastore;


import com.waqar.liquibase.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
