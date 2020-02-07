package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LegalEntity {
    private Long id;
    private Client client;
    private String name;
    private String edrpou;
    private String mfo;
    private String address;
}
