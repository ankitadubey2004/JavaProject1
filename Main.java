import java.util.Scanner;

interface Utility {
    void get_details();

    void set_details();
}

class Showroom implements Utility {
    private String name;
    private String location;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " + name);
        System.out.println("Showroom Location: " + location);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Showroom Name:");
        name = sc.nextLine();
        System.out.println("Enter Showroom Location:");
        location = sc.nextLine();
    }
}

class Employee implements Utility {
    private String name;
    private String designation;

    @Override
    public void get_details() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        name = sc.nextLine();
        System.out.println("Enter Employee Designation:");
        designation = sc.nextLine();
    }
}

class Car implements Utility {
    private String model;
    private String price;

    @Override
    public void get_details() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Model:");
        model = sc.nextLine();
        System.out.println("Enter Car Price:");
        price = sc.nextLine();
    }
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println(
                "======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[5];
        Employee[] employees = new Employee[5];
        Car[] cars = new Car[5];
        int carCounter = 0, showroomCounter = 0, employeeCounter = 0, choice;

        do {
            main_menu();
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (showroomCounter < 5) {
                        showrooms[showroomCounter] = new Showroom();
                        showrooms[showroomCounter].set_details();
                        showroomCounter++;
                    } else {
                        System.out.println("Maximum Showrooms Added");
                    }
                    break;
                case 2:
                    if (employeeCounter < 5) {
                        employees[employeeCounter] = new Employee();
                        employees[employeeCounter].set_details();
                        employeeCounter++;
                    } else {
                        System.out.println("Maximum Employees Added");
                    }
                    break;
                case 3:
                    if (carCounter < 5) {
                        cars[carCounter] = new Car();
                        cars[carCounter].set_details();
                        carCounter++;
                    } else {
                        System.out.println("Maximum Cars Added");
                    }
                    break;
                case 4:
                    if (showroomCounter == 0) {
                        System.out.println("No Showrooms Added");
                    }
                    for (int i = 0; i < showroomCounter; i++) {
                        showrooms[i].get_details();
                    }
                    break;
                case 5:
                    if (employeeCounter == 0) {
                        System.out.println("No Employees Added");
                    }
                    for (int i = 0; i < employeeCounter; i++) {
                        employees[i].get_details();
                    }
                    break;
                case 6:
                    if (carCounter == 0) {
                        System.out.println("No Cars Added");
                    }
                    for (int i = 0; i < carCounter; i++) {
                        cars[i].get_details();
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice. Please enter a number between 0 and 6.");
            }
        } while (choice != 0);

        sc.close();
    }
}
