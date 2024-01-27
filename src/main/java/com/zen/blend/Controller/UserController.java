package com.zen.blend.Controller;

import com.zen.blend.Model.User;
import com.zen.blend.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    private String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "User Created Successfully";
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "User Deleted Successfully";
    }

}
