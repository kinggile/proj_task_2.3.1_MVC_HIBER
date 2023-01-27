package LEGACY.Legacy;

import java.util.List;

public interface CarDAO {
    List<Car> getCountedCars(int count);
    List<Car> getAllCars();
}
