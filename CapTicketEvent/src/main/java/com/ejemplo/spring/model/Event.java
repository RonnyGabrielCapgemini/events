package com.ejemplo.spring.model;



import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="eventticket")
public class Event {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String shortdescription;
	private String longdescription;
	private Date eventdate;
	private Time eventhour;
	private Double price;
	private String rules;
	private String hall;
	
	public Event() {
		super();
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", shortdescription=" + shortdescription + ", longdescription="
				+ longdescription + ", eventdate=" + eventdate + ", eventhour=" + eventhour + ", price=" + price
				+ ", rules=" + rules + ", hall=" + hall + "]";
	}
	public Event(int id, String name, String shortdescription, String longdescription, Date eventdate, Time eventhour,
			Double price, String rules, String hall) {
		super();
		this.id = id;
		this.name = name;
		this.shortdescription = shortdescription;
		this.longdescription = longdescription;
		this.eventdate = eventdate;
		this.eventhour = eventhour;
		this.price = price;
		this.rules = rules;
		this.hall = hall;
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
	public String getLongdescription() {
		return longdescription;
	}
	public void setLongdescription(String longdescription) {
		this.longdescription = longdescription;
	}
	public Date getEventdate() {
		return eventdate;
	}
	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}
	public Time getEventhour() {
		return eventhour;
	}
	public void setEventhour(Time eventhour) {
		this.eventhour = eventhour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getHall() {
		return hall;
	}
	public void setHall(String hall) {
		this.hall = hall;
	}

}
