package org.sourabh.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
 
    private Long id;
    private String name;
    private String email;
    private String password;
}
