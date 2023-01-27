package LEGACY.Legacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCarTable(@RequestParam(value = "count", defaultValue = "5",
            required = false) Integer count, Model model) {

        model.addAttribute("cars", carService.getCountedCars(count));

        return "cars";
    }
}
