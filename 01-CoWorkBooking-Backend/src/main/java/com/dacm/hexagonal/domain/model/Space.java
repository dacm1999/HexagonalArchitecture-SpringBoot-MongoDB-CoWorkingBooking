package com.dacm.hexagonal.domain.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import java.util.List;

@Data
@Builder
public class Space {

    @Id
    private String id;
    private String spaceName; // Name of the space
    private String description; // Description of the space
    private int capacity; // Max capacity of the space
    private List<String> amenities; // Available amenities
    private boolean available; // Is the space available?
    private String location; // Localization of the space


}
