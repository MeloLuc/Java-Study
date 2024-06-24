package exceptions.tryCatch.aplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        //TRY-CATCH  METHOD CALL STACK
        method1();
        
        //BLOCK FINALLY
        fileOpen();

        System.out.println("Program end!");
    }

    public static void method1() {
        System.out.println("*** METHOD 1 START ***");
        method2();
        System.out.println("*** METHOD 1 FINISH ***");
    }

    public static void method2() {
        System.out.println("*** METHOD 2 START ***");
        Scanner sc = new Scanner(System.in);
        // i don't want my program to stop with the exception, i want it to catch the exception and give me something
        try{
            System.out.print("enter string line for vect: ");
            String[] vectString = sc.nextLine().split(" ");
            System.out.print("Enter position: ");
            int position = sc.nextInt();
            System.out.println(vectString[position]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
            //method call stack
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e) {
            System.out.println("input error!");
            //method call stack
            e.printStackTrace();
            sc.next();
        }  

        System.out.println("*** METHOD 2 FINISH ***");
        sc.close();
    }

    public static void fileOpen() {

        File file = new File("/home/lucasmelo/Documentos/teste.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("error opening file: " + e.getMessage());
        }
        finally{
            if(sc!= null){
                sc.close();
            }
            System.out.println("finally block executed");
        }
    }

}
