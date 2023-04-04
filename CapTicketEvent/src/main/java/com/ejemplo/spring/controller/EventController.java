package com.ejemplo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring.model.Event;
import com.ejemplo.spring.response.EventDTO;
import com.ejemplo.spring.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService eventServ;
	
	@GetMapping("/events")
    public List<EventDTO> list() {
        final List<Event> all = eventServ.findAll();       
        return EventDTO.of(all);
    }
	
	@PostMapping("/save")
    public EventDTO addUser(@RequestBody Event event) {
        final Event u = eventServ.save(event);
        return EventDTO.of(u);
    }
	
	
	
}
