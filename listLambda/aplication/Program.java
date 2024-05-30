package listLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        
//interface, Wrapper class      List is implemented in ArrayList
        List<String> list = new ArrayList<>();

        list.add("lucas");
        list.add("islla");
        list.add("fabio");
        list.add("miriam");
        list.add("leo");
        list.add("isabela");
        list.add("fernado");
        list.add("marco");

        System.out.println(list.size());

        //for each
        for(String x : list) {
            System.out.println(x);
        }

        //remove with predicate
        System.out.println("----------");
        list.removeIf(x -> x.charAt(0) == 'l');
        for(String x : list) {
            System.out.println(x);
        }

        //create a sublist with predicate - lambda
        System.out.println("----------");
        List<String> result = list.stream().filter(x -> x.charAt(1) == 'a').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }

        //find firt in list   stream=fluxo
        System.out.println("----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name);
    }
}