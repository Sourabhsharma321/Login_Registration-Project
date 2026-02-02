package org.sourabh.login;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginServiceImpl implements LoginService {


@Autowired
private LoginRepository userRepository;
@Override
  public String register(Login user) {

        LoginEntity entity = new LoginEntity();
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());

        userRepository.save(entity);

        return "Register Successful";
    }
@Override
  public String login(String email, String password) {

        Optional<LoginEntity> u = userRepository.findByEmail(email);

        if (u.isPresent() && u.get().getPassword().equals(password)) {
            return "Login Successful";
        }

        return "Invalid Credentials";
    }




}
