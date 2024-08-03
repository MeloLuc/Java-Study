package workingWithFiles.reading;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reading {
    
    public static void main(String[] args) {
        
        File file = new File("/home/lucasmelo/Documentos/teste.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file); //maybe don't instantiate - if in finally
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
        finally {
            if(sc != null) {
               sc.close(); //always remember to close the Scanner 
            } 
        }
    }
}
