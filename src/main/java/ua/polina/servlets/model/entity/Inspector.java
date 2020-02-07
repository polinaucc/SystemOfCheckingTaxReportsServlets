package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class Inspector {
    private Long id;
    private String surname;
    private String firstName;
    private String secondName;
    private LocalDateTime employmentDate;
    private User user;
    private Report report;
    private Set<Claim> claims;
}
