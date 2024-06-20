package inheritanceAndPolymorphism.exercise01.aplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import inheritanceAndPolymorphism.exercise01.entities.Employee;
import inheritanceAndPolymorphism.exercise01.entities.OutsourcedEmployee;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println();
        System.out.print("HOW MANY EMPLOYEES? ");
        int numberEmployees = sc.nextInt();

        for(int i=1; i <= numberEmployees; i++) {
            System.out.println();
            System.out.println("-- #"+ i + " Employee Data --");
            System.out.print("is this employee outsourced (y/n)? ");
            char outSourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine(); //clear
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value Per Hour: ");
            double valuePerHour = sc.nextDouble();

            if(outSourced == 'y') {
                System.out.print("Adicional charge: ");
                double charge = sc.nextDouble();
                Employee employee =  new OutsourcedEmployee(name, hours, valuePerHour, charge); //upcasting
                list.add(employee);
            }
            else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }
        }

        System.out.println();
        System.out.println("-- PAYMENT --");
        for(Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment())); //polymorphism
        }

        sc.close();
    }
}
