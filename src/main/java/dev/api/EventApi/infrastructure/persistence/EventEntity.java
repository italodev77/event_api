package dev.api.EventApi.infrastructure.persistence;

import dev.api.EventApi.blindado.enums.EventCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "Events")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String identifier;
    private String local;
    private Integer capacity;
    @Enumerated(EnumType.STRING)
    private EventCategory category;
}
