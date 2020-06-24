package br.com.tga.oauth2.showinfouser;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tga.oauth2.showinfouser.security.User;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

@RestController
public class UserController {
    
    @PostMapping("/auth")
    public User autenticaUser(@AuthenticationPrincipal User userAuth ){
        return userAuth;
    }
}