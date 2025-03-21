package dev.api.EventApi.infrastructure.presentation;

import dev.api.EventApi.infrastructure.dtos.EventDTO;
import dev.api.EventApi.infrastructure.persistence.EventEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Event")
public class EventController {

    @PostMapping("criarEvento")
    public String criarEvento(@RequestBody EventDTO eventDTO){
        return "Evento criado";
    }
}
