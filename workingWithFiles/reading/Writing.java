package workingWithFiles.reading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};

        String path = "/home/lucasmelo/Documentos/testeWriter.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for(String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// new FileWriter(path, true) -> adds to existing file
// new FileWriter(path) -> create or receates an existing file
