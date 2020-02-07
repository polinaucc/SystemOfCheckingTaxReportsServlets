package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class User {
    private Long id;
    private Set<RoleType> authorities;
    private String email;
    private String password;
    }
