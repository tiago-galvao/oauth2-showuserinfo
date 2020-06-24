package br.com.tga.oauth2.showinfouser.security;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter private String nome;
    @Getter @Setter private Integer id;
}