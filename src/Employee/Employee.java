package Employee;

import java.util.Scanner;

public class Employee {
    String name;
    String gender;
    String address;
    String position;
    double salary;

    public Employee() {
    }

    public Employee(String name, String gender, String address, String position, double salary) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void getInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = input.nextLine();
        System.out.println("Enter Gender: ");
        gender = input.nextLine();
        System.out.println("Enter Address: ");
        address = input.nextLine();
        System.out.println("Enter Position: ");
        position = input.nextLine();
        System.out.println("Enter Salary: ");
        salary= Float.parseFloat(input.nextLine());
    }
    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
