package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.dao.CarDAOi;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import web.model.Car;

import javax.transaction.Transactional;

@Service
public class CarService implements  CarServicei {
    @Autowired
    private CarDAO carDAO;
    @Transactional
    public List<Car> getCars(String i) {
        return carDAO.listCars().subList(0, Integer.parseInt(i));
    }
}
