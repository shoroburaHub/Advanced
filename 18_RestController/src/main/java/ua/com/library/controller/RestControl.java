package ua.com.library.controller;

;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.library.dto.DtoUtilMapper;
import ua.com.library.dto.UserDTO;
import ua.com.library.entity.User;
import ua.com.library.service.UserService;

import java.util.List;

/**
 * Created by admin on 14.12.2016.
 */

@RestController
public class RestControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public List<UserDTO> registration(@RequestBody User user) throws Exception {

       userService.save(user);

        return DtoUtilMapper.usersToUsersDTO(userService.findAll());
    }


}
