package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Renouncment {
    private Long id;
    private Report report;
    private LocalDateTime date;
    private String reason;
}
