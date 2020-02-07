package ua.polina.servlets.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class File {
    private Long id;
    private byte[] picture;
    private Set<Report> reports;
}
