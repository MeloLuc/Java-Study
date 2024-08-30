package set.exe04.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set.exe04.entities.LogEntry;

public class Program {
    
    public static void main(String[] args) {

        System.out.println("----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        Set<LogEntry> set = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));

                System.out.println("data of file: username-" + username + " date-" + fields[1]);

                set.add(new LogEntry(username, date));
                
                line = br.readLine();

            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------");

        //como eu quero saber a quantidade de usuários usando a estrutura Set
        //ela não permiti que adicionemos usuários repetidos
        System.out.println("Total users: " + set.size());

        for(LogEntry l : set) {
            System.out.println("data placed: username-" + l.getUsername() + " date-" + l.getMoment().toInstant());
        }
        System.out.println("----------");

        sc.close();
    }
}
