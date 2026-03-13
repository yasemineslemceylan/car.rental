import java.util.ArrayList;

public class RentalSystem {

    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();
    private ArrayList<Rental> rentalHistory = new ArrayList<>();
    public void addCar(Car car) {
        cars.add(car);
    }

    public void showCars() {

        for (int i = 0; i < cars.size(); i++) {

            Car car = cars.get(i);

            System.out.println(i + " - " +
                    car.getBrand() + " " +
                    car.getModel() +
                    " Available: " + car.isAvailable());

        }

    }

    public void rentCar(int index, String customerName) {

    // Önce bu kişinin zaten araba kiralayıp kiralamadığını kontrol et
    for (Rental r : rentals) {

        if (r.getCustomer().getName().equalsIgnoreCase(customerName)) {
            System.out.println(customerName + " already rented a car");
            return;
        }

    }

    if (index >= 0 && index < cars.size()) {

        Car car = cars.get(index);

        if (car.isAvailable()) {

            Customer customer = new Customer(customerName);

            car.setAvailable(false);

            Rental rental = new Rental(car, customer);
            rentals.add(rental);

            System.out.println(customer.getName() +
                    " rented " +
                    car.getBrand() + " " +
                    car.getModel());

        } else {

            System.out.println("Car already rented");

        }

    } else {

        System.out.println("Invalid car number");

    }

}
    public void returnCar(String customerName) {

    for (Rental r : rentals) {

        Customer c = r.getCustomer();

        if (c.getName().equalsIgnoreCase(customerName)) {

            Car car = r.getCar();

            car.setAvailable(true);

            rentals.remove(r);
            rentalHistory.add(r);

            System.out.println(customerName + " returned " +
                    car.getBrand() + " " + car.getModel());

            return;

        }

    }

    System.out.println("No rental found for " + customerName);

}
    public void showRentals() {

        if (rentals.isEmpty()) {

            System.out.println("No rentals");

        } else {

            for (Rental r : rentals) {

                Car car = r.getCar();
                Customer c = r.getCustomer();

                System.out.println(c.getName() +
                        " rented " +
                        car.getBrand() + " " +
                        car.getModel());

            }

        }

    }
    public void showRentalHistory() {

    if (rentalHistory.isEmpty()) {

        System.out.println("No rental history");

    } else {

        for (Rental r : rentalHistory) {

            System.out.println(
                    r.getCustomer().getName() +
                    " rented " +
                    r.getCar().getBrand() + " " +
                    r.getCar().getModel()
            );

        }

    }

}
public void showTotalRentals() {

    System.out.println("Total rentals: " + rentals.size());

}
public void searchCar(String brand) {

    boolean found = false;

    for (int i = 0; i < cars.size(); i++) {

        Car car = cars.get(i);

        if (car.getBrand().equalsIgnoreCase(brand)) {

            System.out.println(i + " - " +
                    car.getBrand() + " " +
                    car.getModel() +
                    " Available: " + car.isAvailable());

            found = true;

        }

    }

    if (!found) {
        System.out.println("No cars found for brand: " + brand);
    }

}

}