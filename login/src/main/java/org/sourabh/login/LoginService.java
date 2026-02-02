package org.sourabh.login;

public interface LoginService {

    
String register(Login user);
String login(String email, String password);
    
}
