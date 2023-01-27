package LEGACY.Legacy;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;

    {
        carList = List.of(
                new Car("model1", 1, 1),
                new Car("model2", 2, 2),
                new Car("model3", 3, 3),
                new Car("model4", 4, 4),
                new Car("model5", 5, 5)
        );

//        carList = new ArrayList<>();
//        Car car1 = new Car("model1", 1, 1);
//        Car car2 = new Car("model2", 2, 2);
//        Car car3 = new Car("model3", 3, 3);
//        Car car4 = new Car("model4", 4, 4);
//        Car car5 = new Car("model5", 5, 5);
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        carList.add(car4);
//        carList.add(car5);
    }

    @Override
    public List<Car> getCountedCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
