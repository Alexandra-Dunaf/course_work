package ru.dunaf.facade;

import org.springframework.stereotype.Component;
import ru.dunaf.dto.UserDTO;
import ru.dunaf.entity.User;

@Component
public class UserFacade {

    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getName());
        userDTO.setLastname(user.getLastname());
        userDTO.setUsername(user.getUsername());
        userDTO.setBiography(user.getBiography());
        return userDTO;
    }
}
