package com.example.demo.entity;

import com.mongodb.client.result.UpdateResult;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@Getter
@Document("events")
public class EventEntity {

	protected EventEntity()
	{

	}

	public EventEntity(String name,int capacity,int price)
	{
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.sold = 0;
	}

	@Id
	private String id;

	private String name;

	private int capacity;

	private int price;

	private int sold;

	public boolean isSoldOut()
	{
		return sold>= capacity;
	}
}
