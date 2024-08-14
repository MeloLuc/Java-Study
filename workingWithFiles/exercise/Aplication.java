package workingWithFiles.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        List<Produto> produtos = new ArrayList<>();

        //READING
        try(BufferedReader br = new BufferedReader(new FileReader(path))) { //try-with-resourcer garante que serão fechados aos final do blobo -> "finally"

            String line = br.readLine();

            while(line != null) {
                String[] words = line.split(",");
                String name = words[0];
                Double price = Double.parseDouble(words[1]);
                Double quantity = Double.parseDouble(words[2]);

                Double valueTotal = (Double)(price * quantity);

                Produto pd = new Produto(name, valueTotal);
                produtos.add(pd);
                
                line = br.readLine();
        
            }
        }
        catch(IOException e) {
            System.out.println("ERROR " + e.getMessage());
        }

        //WRITING
        if(produtos.size() != 0){

            String folderCreated = null;
            File pathFile = new File(path);
            String pathParent = pathFile.getParent();
            boolean sucess = new File(pathParent + "/out").mkdir();
            if(sucess) {
                System.out.println("Diretorio criado");
                folderCreated = pathParent + "/out";
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(folderCreated+"/summary.csv"))) {

                for(Produto pd : produtos) {
                    bw.write(pd.getName()+","+pd.getPrice());
                    bw.newLine();
                }
            }
            catch(IOException e) {
                System.out.println("ERROR "+ e.getMessage());
            }

        }

        sc.close();
    }
}
