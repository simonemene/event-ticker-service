package com.example.demo.mapper;

import com.example.demo.dto.EventRequestDto;
import com.example.demo.dto.EventResponseDto;
import com.example.demo.entity.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

	public EventResponseDto toDto(EventEntity event)
	{
		return new EventResponseDto(event.getId(),event.getName(),event.getCapacity(),event.getPrice(),
				event.getSold());
	}

	public EventEntity toEntity(EventRequestDto request)
	{
		return new EventEntity(request.name(),request.capacity(),request.price());
	}
}
