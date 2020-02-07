package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class Report {
    private Long id;
    private Client client;
    private Inspector inspector;
    private LocalDateTime date;
    private String comment;
    private Set<File> files;
}
