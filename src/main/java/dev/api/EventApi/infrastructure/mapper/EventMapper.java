package dev.api.EventApi.infrastructure.mapper;

import dev.api.EventApi.blindado.entities.Event;
import dev.api.EventApi.infrastructure.dtos.EventDTO;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {
    public Event toEntity(EventDTO eventDTO) {
        return new Event(
                eventDTO.id(),
                eventDTO.name(),
                eventDTO.description(),
                eventDTO.startDate(),
                eventDTO.endDate(),
                eventDTO.identifier(),
                eventDTO.local(),
                eventDTO.capacity(),
                eventDTO.category()
        );
    }

    public EventDTO toDTO(Event event) {
        return new EventDTO(
                event.id(),
                event.name(),
                event.description(),
                event.startDate(),
                event.endDate(),
                event.identifier(),
                event.local(),
                event.capacity(),
                event.category()
        );
    }

}
