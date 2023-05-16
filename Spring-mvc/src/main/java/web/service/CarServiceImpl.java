package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAOImpl carDAO;

    public List<Car> getCars(String count) {
        return carDAO.listCars().subList(0, Integer.parseInt(count));
    }
}
