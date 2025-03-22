package dev.api.EventApi.infrastructure.presentation;

import dev.api.EventApi.blindado.entities.Event;
import dev.api.EventApi.blindado.useCases.IcreateEventUseCase;
import dev.api.EventApi.infrastructure.dtos.EventDTO;
import dev.api.EventApi.infrastructure.mapper.EventMapper;
import dev.api.EventApi.infrastructure.persistence.EventEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Event")
public class EventController {

    private final IcreateEventUseCase icreateEventUseCase;
    private final EventMapper eventMapper;

    public EventController(IcreateEventUseCase icreateEventUseCase, EventMapper eventMapper) {
        this.icreateEventUseCase = icreateEventUseCase;
        this.eventMapper = eventMapper;
    }



    @PostMapping("criarEvento")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO){
        Event newEvent = icreateEventUseCase.execute(eventMapper.toEntity(eventDTO));

        return eventMapper.toDTO(newEvent);
    }

    @GetMapping
    public String ListEvent(){
        return "Lista de eventos"
    }
}
