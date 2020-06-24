package br.com.tga.oauth2.showinfouser.security;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class UserPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        User user = new User();
        user.setId((Integer) map.get("id"));
        user.setNome((String) map.get("name"));
        return user;
    }
    
}