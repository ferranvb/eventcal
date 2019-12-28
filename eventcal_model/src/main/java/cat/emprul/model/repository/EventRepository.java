package cat.emprul.model.repository;

import org.springframework.data.repository.CrudRepository;

import cat.emprul.model.entity.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
