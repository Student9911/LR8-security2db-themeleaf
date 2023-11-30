package ru.aurakhov.lr8security2dbthemeleaf.service;

import ru.aurakhov.lr8security2dbthemeleaf.dto.UserDto;
import ru.aurakhov.lr8security2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
