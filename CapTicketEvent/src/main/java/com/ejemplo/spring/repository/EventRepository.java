package com.ejemplo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ejemplo.spring.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
