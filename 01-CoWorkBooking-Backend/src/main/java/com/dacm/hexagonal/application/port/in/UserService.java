package com.dacm.hexagonal.application.port.in;

import com.dacm.hexagonal.infrastructure.adapters.output.persistence.entity.UserEntity;
import com.dacm.hexagonal.infrastructure.adapters.input.dto.UserDto;
import com.dacm.hexagonal.infrastructure.adapters.input.dto.UserRecord;
import com.dacm.hexagonal.infrastructure.adapters.input.response.AddedResponse;
import com.dacm.hexagonal.infrastructure.adapters.input.response.ApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User Service
 * This class is responsible for handling the user requests
 */
@Service
public interface UserService {

    ApiResponse save (UserRecord user);

    AddedResponse saveMultipleUsers (UserEntity[] users);

    ApiResponse updateUser(String username, UserDto userDto);

    ApiResponse deleteByUsername(String username);

    UserDto findByUsername(String username);

    Page<UserDto> findAllUsers(String username, String lastname, String firstname, String email, Pageable pageable);
    List<String> getAllUsernames();

    List<String> getAllEmails();
}
