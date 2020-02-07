package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Client {
    private Long id;
    private User user;
    private ClientType clientType;
    private Individual individual;
    private LegalEntity legalEntity;
    private Report report;
    private Set<Claim> claims;
}
