package map.exe03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<>();

        System.out.print("Enter de file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");  //.csv
                String candidate = fields[0].toLowerCase();
                int numberVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(candidate)) {
                    int votesAux = votes.get(candidate);
                    votes.put(candidate, votesAux + numberVotes);
                } else {
                    votes.put(candidate, numberVotes);
                }
                
                line = br.readLine();
            }

            for (String candidate : votes.keySet()) {
                System.out.println(candidate + ": " + votes.get(candidate));
            }

            sc.close();

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
