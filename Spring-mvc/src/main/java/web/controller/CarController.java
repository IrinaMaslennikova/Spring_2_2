package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {

    private CarDAO carDAO;
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") String count, Model model) {
        model.addAttribute("cars", carDAO.getCars(count));
        return "cars";
    }
}
