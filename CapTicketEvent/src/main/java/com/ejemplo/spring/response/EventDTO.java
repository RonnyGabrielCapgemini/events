package com.ejemplo.spring.response;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.ejemplo.spring.model.Event;

public class EventDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String shortdescription;
	
	public static EventDTO of(Event event) {
		EventDTO eventDto= new EventDTO();
		eventDto.setId(event.getId());
		eventDto.setName(event.getName());
		eventDto.setShortdescription(event.getShortdescription());
		return eventDto;
	}
	
	public static List<EventDTO> of(List<Event> events) {
		return events.stream().map(c -> of(c)).collect(Collectors.toList());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EventDTO [id=" + id + ", name=" + name + ", shortdescription=" + shortdescription + "]";
	}
	public EventDTO() {
		super();
	}
	
	
}
