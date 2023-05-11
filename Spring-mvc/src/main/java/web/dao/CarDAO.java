package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository

public class CarDAO implements CarDAOi {

    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "А111АА22"));
        cars.add(new Car(2, "BMW", "В888ВВ22"));
        cars.add(new Car(3, "LADA", "К873БЛ22"));
        cars.add(new Car(4, "Mitsubishi", "Л000ГД22"));
        cars.add(new Car(5, "Toyota", "Д456ЛП22"));
        return cars;
    }

}
