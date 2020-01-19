package cat.emprul.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.emprul.model.entity.Event;
import cat.emprul.model.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	public Iterable<Event> getAllEvents() {
		return eventRepository.findAll();
	}
	
	public Optional<Event> getCustomer(long eventId) {
		return eventRepository.findById(eventId);
	}
	
	public String getTitol() {
		return "KAL";
	}
}
