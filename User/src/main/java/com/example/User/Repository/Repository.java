package com.example.User.Repository;


import com.example.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {

}
