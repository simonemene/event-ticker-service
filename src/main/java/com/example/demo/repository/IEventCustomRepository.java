package com.example.demo.repository;

import com.example.demo.entity.EventEntity;

public interface IEventCustomRepository {

	boolean buyATicket(String eventId);

	EventEntity createEvent(EventEntity event);
}
