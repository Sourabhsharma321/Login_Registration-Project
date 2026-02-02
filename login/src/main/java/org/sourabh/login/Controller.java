
package org.sourabh.login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
@Autowired
private LoginService userService;


// @GetMapping("/")
// public String home() {
//     return "Server Running";
// }


@PostMapping("/register")
public String register(@RequestBody Login user) {
 return userService.register(user);
}

@PostMapping("/login")
public String login(@RequestBody Login user) {
    
    
    return userService.login(user.getEmail(),user.getPassword());
}


}
