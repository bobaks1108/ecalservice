package com.bobguinn.ecal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bobguinn.ecal.models.Event;
import com.bobguinn.ecal.repositories.EventRepository;

@RestController
@RequestMapping("/api/v1/events")

public class EventsController {
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping
	public List<Event> list() {
		return eventRepository.findAll();

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Event event) {
		eventRepository.save(event);
	}
	 
	@GetMapping("/{id}")
	public Event get(@PathVariable("id") long id) {
		return eventRepository.getById(id);
	}
}
