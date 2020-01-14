package cat.emprul;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cat.emprul.model.config.AppConfig;
import cat.emprul.model.config.DbConfig;
import cat.emprul.model.entity.Event;
import cat.emprul.model.entity.Race;
import cat.emprul.model.service.EventService;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import cat.emprul.model.config.AppConfig;
//import cat.emprul.model.config.DbConfig;
//import cat.emprul.model.entity.Event;
//import cat.emprul.model.entity.Race;
//import cat.emprul.model.service.EventService;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, DbConfig.class);

		//ApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);	

		EventService eventService = ctx.getBean(EventService.class);

		Iterable<Event> llista = eventService.getAllEvents();

		System.out.println("OK");
		for (Event e : llista) {
			System.out.print(e.getNom() + " :: ");
			System.out.print(e.getDescripcio() + " :: ");
			System.out.println(e.getLloc() + " :: ");
			
			List<Race> llistaRaces = e.getLlistaRaces();
			
			if ( llistaRaces != null) {
				for ( Race r : e.getLlistaRaces()) {
					System.out.println(" --- " + r.getNom());
					System.out.println(" --- " + r.getDistancia() + " D+" + r.getDesnivellPos());
				}
			}
		}
		((ConfigurableApplicationContext)ctx).close();
	}
}
