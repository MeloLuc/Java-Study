package workingWithFiles.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading03 {
    
    public static void main(String[] args) {

        String path = "/home/lucasmelo/Documentos/teste.txt";

        // try-with-resources ensure that these resources will be closed at the end of the block.
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("ERROR : "+ e.getMessage());
        }
    }
}
