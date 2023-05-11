package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarServicei {
    public List<Car> getCars(String i);
}
