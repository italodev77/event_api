package dev.api.EventApi.infrastructure.persistence.repository;

import dev.api.EventApi.infrastructure.persistence.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
