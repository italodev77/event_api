package dev.api.EventApi.infrastructure.dtos;

import dev.api.EventApi.blindado.enums.EventCategory;
import lombok.Data;

import java.time.LocalDateTime;


public record EventDTO(
        Long id,
        String name,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String identifier,
        String local,
        Integer capacity,
        EventCategory category
) {}
