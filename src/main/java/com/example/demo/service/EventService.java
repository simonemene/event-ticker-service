package com.example.demo.service;

import com.example.demo.dto.EventRequestDto;
import com.example.demo.dto.EventResponseDto;
import com.example.demo.mapper.EventMapper;
import com.example.demo.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class EventService implements IEventService{

	private final EventRepository eventRepository;

	private final EventMapper mapper;

	@Transactional
	@Override
	public EventResponseDto createEvent(EventRequestDto event) {
		return null;
	}
}
