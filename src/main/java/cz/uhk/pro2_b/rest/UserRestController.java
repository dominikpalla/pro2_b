package cz.uhk.pro2_b.rest;

import cz.uhk.pro2_b.model.User;
import cz.uhk.pro2_b.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserRestController {

    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @PostMapping("/new")
    public String newUser(@RequestBody User user) {
        userService.saveUser(user);
        return "ok";
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        if(userService.getUser(id) == null) {
            return "error";
        }
        userService.saveUser(user);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String updateUser(@PathVariable long id) {
        if(userService.getUser(id) == null) {
            return "error";
        }
        userService.deleteUser(id);
        return "ok";
    }

}
