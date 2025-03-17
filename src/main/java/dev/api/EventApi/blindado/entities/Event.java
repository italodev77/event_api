package dev.api.EventApi.blindado.entities;

import dev.api.EventApi.blindado.enums.EventCategory;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String identifier,
        String local,
        Integer capacity,
        EventCategory category
){}
