package dev.api.EventApi.infrastructure.mapper;

import dev.api.EventApi.infrastructure.dtos.EventDTO;
import dev.api.EventApi.infrastructure.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {
    public EventEntity toEntity(EventDTO eventDTO){
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId(eventDTO.id());
        eventEntity.setDescription(eventDTO.description());
        eventEntity.setName(eventDTO.name());
        eventEntity.setIdentifier(eventDTO.identifier());
        eventEntity.setStartDate(eventDTO.startDate());
        eventEntity.setEndDate(eventDTO.endDate());
        eventEntity.setCapacity(eventDTO.capacity());
        eventEntity.setCategory(eventDTO.category());

        return eventEntity;
    };

    public EventDTO toDTO(EventEntity eventEntity) {
        return new EventDTO(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate(),
                eventEntity.getIdentifier(),
                eventEntity.getLocal(),
                eventEntity.getCapacity(),
                eventEntity.getCategory()
        );
    }

}
