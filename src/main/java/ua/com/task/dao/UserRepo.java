package ua.com.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.task.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
