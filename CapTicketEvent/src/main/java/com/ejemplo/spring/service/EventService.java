package com.ejemplo.spring.service;

import java.util.List;

import com.ejemplo.spring.model.Event;

public interface EventService {

		//--LISTAR 
			public List<Event> findAll();	
		//--ELIMINAR		
			public void deleteById(int id);		
		//-- GUARDAR		
			public Event save(Event event);
			
}
