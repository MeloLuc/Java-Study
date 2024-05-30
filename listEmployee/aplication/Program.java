package listEmployee.aplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import listEmployee.entities.Employee;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Employee> listEmployee = new ArrayList<>();
        ArrayList<String> listId = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int quantityEmployee = sc.nextInt();

        // create Employee
        for (int i = 0; i < quantityEmployee; i++) {
            sc.nextLine();
            System.out.printf("EMPLOYEE #%d%n", i + 1);

            System.out.print("ID: ");
            String id = sc.nextLine();
            // Only one ID per employee
            while (!verifyIdFree(id, listId)) {
                System.out.println("existing ID !!");
                System.out.print("other ID: ");
                id = sc.nextLine();
            }
            listId.add(id);

            System.out.print("NAME: ");
            String name = sc.nextLine();

            System.out.print("SALARY: ");
            float salary = sc.nextFloat();
            Employee newEmp = new Employee(id, salary, name);
            listEmployee.add(newEmp);
            System.out.println();
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        sc.nextLine();
        String idIncrease = sc.nextLine();
        System.out.println();

        List<Employee> employeeIncrease = listEmployee.stream().filter(x -> x.getId().equals(idIncrease))
                .collect(Collectors.toList());

        if (employeeIncrease.size() == 1) {
            for (Employee x : employeeIncrease) {

                System.out.print("Enter the percentage: ");
                float percent = sc.nextFloat();
                x.increasePercentSalary(percent);
                System.out.println();
            }
        } else {
            System.out.println("ID not found!!!");
            System.out.println("--increase not realized--");
            System.out.println();
        }

        sc.close();

        for (Employee x : listEmployee) {
            System.out.println(x);
        }

    }

    public static boolean verifyIdFree(String id, ArrayList<String> listId) {

        if (listId.isEmpty()) {
            return true;
        }

        for (int i = 0; i < listId.size(); i++) {
            if (id.equals(listId.get(i))) {
                return false;
            }
        }

        return true;
    }

}
