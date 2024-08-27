package generics.exe02.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.exe02.services.CalculationService;
import generics.exe02.entities.Product;

public class Program {
     public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "/home/lucasmelo/Documentos/teste.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("most expensive:   ");
            System.out.println(x);
        }
        catch (IOException e) {
            System.out.println("ERROR - "+ e.getMessage());
        }
     }
}
