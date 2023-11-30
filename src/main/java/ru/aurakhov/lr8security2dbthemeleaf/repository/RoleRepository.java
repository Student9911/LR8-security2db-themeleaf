package ru.aurakhov.lr8security2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aurakhov.lr8security2dbthemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
