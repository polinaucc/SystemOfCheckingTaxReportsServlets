package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Individual {
    private Long id;
    private Client client;
    private String surnmae;
    private String firstName;
    private String secondName;
    private String passport;
    private String identCode;
    private String address;
}
