package com.example.demo.repository;

import com.example.demo.entity.EventEntity;
import com.mongodb.client.result.UpdateResult;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class EventCustomRepository implements IEventCustomRepository{

	private final MongoTemplate template;

	@Override
	public boolean buyATicket(String eventId) {

		Query query = new Query(Criteria
				.where("id").is(eventId)
				.and("sold").lt("capacity")
		);

		Update update = new Update().inc("sold",1);
		UpdateResult result=
				template.updateFirst(
						query,
						update,
						EventEntity.class
				);
		return result.getModifiedCount() == 1;
	}

	@Override
	public EventEntity createEvent(EventEntity event) {
		return null;
	}

}
