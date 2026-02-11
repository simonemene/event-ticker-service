package com.example.demo.controller;

import com.example.demo.dto.EventRequestDto;
import com.example.demo.dto.EventResponseDto;
import com.example.demo.service.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EventController {

	private final IEventService service;

	@PostMapping
	public ResponseEntity<EventResponseDto> getEvent(@RequestBody EventRequestDto event)
	{
		return ResponseEntity.ok(service.)
	}
}
