public class Rental {

    private Car car;
    private Customer customer;

    public Rental(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }
}