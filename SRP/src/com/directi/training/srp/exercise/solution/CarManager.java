public class CarManager {
    private CarRepository _carRepository = new CarRepository();

    public Car getFromDb(final String carId) {
        return this._carRepository.getFromDb(carId);
    }

    public String getCarsNames() {
        return this._carRepository.getCarsNames();
    }

    public Car getBestCar() {
        return this._carRepository.getBestCar();

    }
}