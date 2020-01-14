package cat.emprul.eventcal.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("basicView")
@Scope("view")
public class BasicView implements Serializable {
     
    private List<Car> cars = new ArrayList<Car>();
    
    public BasicView() {
    	this.init();
    }
     
    
    @PostConstruct
    public void init() {
        Car c1 = new Car(1,1999,"Ford","blanc");
        Car c2 = new Car(1,1999,"Toyota","blanc");
        cars.add(c1);
        cars.add(c1);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    
}
