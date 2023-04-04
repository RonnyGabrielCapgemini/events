package com.ejemplo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.spring.model.Event;
import com.ejemplo.spring.repository.EventRepository;
@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	EventRepository eventrepo;
	
	@Override
	public List<Event> findAll() {
		return eventrepo.findAll();
	}

	@Override
	public void deleteById(int id) {
		
	}

	@Override
	public Event save(Event event) {
		return eventrepo.save(event);
	}

}
