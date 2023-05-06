package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component

public class CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "А111АА22"));
        cars.add(new Car(2, "BMW", "В888ВВ22"));
        cars.add(new Car(3, "LADA", "К873БЛ22"));
        cars.add(new Car(4, "Mitsubishi", "Л000ГД22"));
        cars.add(new Car(5, "Toyota", "Д456ЛП22"));
    }
    public List<Car> getCars(String i) {
        return cars.subList(0, Integer.parseInt(i));
    }
}
