class Manager {
    public void manage() {
        System.out.println("Manager manages");
    }
}

class TeamLead extends Manager {
    public void lead() {
        System.out.println("TeamLead leads");
    }
}

class Developer extends Manager {
    public void develop() {
        System.out.println("Developer develops");
    }
}

class Tester extends Manager {
    public void test() {
        System.out.println("Tester tests");
    }
}

class Architect extends Manager {
    public void design() {
        System.out.println("Architect designs");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();
        Developer dev = new Developer();
        Tester tester = new Tester();
        Architect arch = new Architect();

        tl.manage();    // Manager's method
        tl.lead();

        dev.manage();   // Manager's method
        dev.develop();

        tester.manage();    // Manager's method
        tester.test();

        arch.manage();  // Manager's method
        arch.design();
    }
}

/*
Problem Statement:
Design a class hierarchy for a car rental system. The system should be able to handle different types of vehicles, including cars, motorcycles, and trucks. Each vehicle can have specific attributes such as make, model, year of manufacture, and rental price. Implement a class hierarchy using all three inheritance methods (single, multilevel, and hierarchical) to represent the relationship between the different types of vehicles.

Requirements:
1. Each vehicle should have a unique identification number.
2. The car class should have additional attributes like the number of doors and seating capacity.
3. The motorcycle class should have additional attributes like the engine displacement and top speed.
4. The truck class should have additional attributes like the cargo capacity and number of axles.
5. All vehicles should have common functionality, such as displaying vehicle information and calculating rental charges based on the number of days rented.
6. The car class should inherit from a base vehicle class, which contains common attributes and methods for all vehicles.
7. The motorcycle and truck classes should inherit from the base vehicle class as well.
8. The rental charges should be calculated based on the rental price per day and the number of days rented.
9. The system should provide methods to add new vehicles, retrieve vehicle information, and calculate rental charges.

Design Class Hierarchy:
1. Vehicle (Base Class)
   - Attributes:
     - identificationNumber: int
     - make: String
     - model: String
     - yearOfManufacture: int
     - rentalPricePerDay: double
   - Methods:
     - displayInformation()
     - calculateRentalCharges(days: int): double

2. Car (Single Inheritance from Vehicle)
   - Attributes:
     - numberOfDoors: int
     - seatingCapacity: int

3. Motorcycle (Single Inheritance from Vehicle)
   - Attributes:
     - engineDisplacement: double
     - topSpeed: double

4. Truck (Single Inheritance from Vehicle)
   - Attributes:
     - cargoCapacity: double
     - numberOfAxles: int

5. CompactCar (Multilevel Inheritance from Car)
   - (No additional attributes or methods)

6. LuxuryCar (Multilevel Inheritance from Car)
   - (No additional attributes or methods)

7. SportMotorcycle (Multilevel Inheritance from Motorcycle)
   - (No additional attributes or methods)

8. OffRoadMotorcycle (Multilevel Inheritance from Motorcycle)
   - (No additional attributes or methods)

9. PickupTruck (Multilevel Inheritance from Truck)
   - (No additional attributes or methods)

10. BoxTruck (Multilevel Inheritance from Truck)
    - (No additional attributes or methods)
*/