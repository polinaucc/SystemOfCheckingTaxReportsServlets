package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Claim {
    private Long id;
    private Client client;
    Inspector inspector;
    String reason;
    Status status;
}
