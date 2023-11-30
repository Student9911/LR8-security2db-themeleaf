package ru.aurakhov.lr8security2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aurakhov.lr8security2dbthemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
