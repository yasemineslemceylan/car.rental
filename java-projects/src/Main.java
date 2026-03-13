import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RentalSystem system = new RentalSystem();

        // 20 cars
        system.addCar(new Car("Mercedes", "C200"));
        system.addCar(new Car("Mercedes", "E300"));
        system.addCar(new Car("Mercedes", "S500"));
        system.addCar(new Car("Audi", "A4"));
        system.addCar(new Car("Audi", "A6"));
        system.addCar(new Car("Audi", "Q7"));
        system.addCar(new Car("BMW", "320i"));
        system.addCar(new Car("BMW", "X5"));
        system.addCar(new Car("BMW", "M3"));
        system.addCar(new Car("Toyota", "Corolla"));
        system.addCar(new Car("Toyota", "Camry"));
        system.addCar(new Car("Toyota", "RAV4"));
        system.addCar(new Car("Volkswagen", "Golf"));
        system.addCar(new Car("Volkswagen", "Passat"));
        system.addCar(new Car("Volkswagen", "Tiguan"));
        system.addCar(new Car("Citroen", "C3"));
        system.addCar(new Car("Citroen", "C4"));
        system.addCar(new Car("Citroen", "C5 Aircross"));
        system.addCar(new Car("Audi", "Q5"));
        system.addCar(new Car("BMW", "X3"));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nCar Rental System");
            System.out.println("1 Show Cars");
            System.out.println("2 Rent Car");
            System.out.println("3 Return Car");
            System.out.println("4 Show Rentals");
            System.out.println("5 Add Car");
            System.out.println("6 Search Car");
            System.out.println("7 Rental History");
            System.out.println("8 Total Rentals");
            System.out.println("9 Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {

                system.showCars();

            }

            else if (choice == 2) {

                scanner.nextLine();

                System.out.println("Enter customer name:");
                String name = scanner.nextLine();

                System.out.println("Enter car number:");
                int index = scanner.nextInt();

                system.rentCar(index, name);

            }

            else if (choice == 3) {

                scanner.nextLine();

                System.out.println("Enter customer name:");
                String name = scanner.nextLine();

                system.returnCar(name);

            }

            else if (choice == 4) {

                system.showRentals();

            }

            else if (choice == 5) {

                scanner.nextLine();

                System.out.println("Enter car brand:");
                String brand = scanner.nextLine();

                System.out.println("Enter car model:");
                String model = scanner.nextLine();

                system.addCar(new Car(brand, model));

                System.out.println("Car added successfully");

            }

            else if (choice == 6) {

                scanner.nextLine();

                System.out.println("Enter brand:");
                String brand = scanner.nextLine();

                system.searchCar(brand);

            }

            else if (choice == 7) {

                system.showRentalHistory();

            }

            else if (choice == 8) {

                system.showTotalRentals();

            }

            else if (choice == 9) {

                System.out.println("Goodbye");
                break;

            }

            else {

                System.out.println("Invalid choice");

            }

        }

    }

}