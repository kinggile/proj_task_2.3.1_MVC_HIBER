package LEGACY.Legacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCountedCars(int count) {
        return carDAO.getCountedCars(count);
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
