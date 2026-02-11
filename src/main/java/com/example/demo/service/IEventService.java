package com.example.demo.service;

import com.example.demo.dto.EventRequestDto;
import com.example.demo.dto.EventResponseDto;

public interface IEventService {

	EventResponseDto createEvent(EventRequestDto event);


}
