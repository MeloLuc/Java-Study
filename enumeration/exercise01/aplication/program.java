package enumeration.exercise01.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.exercise01.entities.Department;
import enumeration.exercise01.entities.HourContract;
import enumeration.exercise01.entities.Worker;
import enumeration.exercise01.entities.enums.WorkerLevel;

public class program {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("-Enter worker data-");
        System.out.print("name: ");
        String workerName = sc.nextLine();
        System.out.print("level: ");
        String workerLevel = sc.nextLine();
        System.out.print("base salary: ");
        Double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker ? ");
        int numberContracts = sc.nextInt();

        for (int i = 1 ; i <= numberContracts; i++) {
            System.out.printf("Enter contract #%d data-%n", i);
            System.out.print("Date DD/MM/YYYY: ");
            Date contractDate = dateF.parse(sc.next());
            System.out.print("Value per hour: ");
            Double contractValue = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int contractHour = sc.nextInt();

            HourContract contract = new HourContract(contractDate, contractValue, contractHour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month =  Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear + ": "+ worker.income(year, month));
        sc.close();
    }
}
