package generics.wildcardTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    
    public static void main(String[] args) {
        
        List<?> curinga = new ArrayList<Object>();
        List<Integer> inteiros = new ArrayList<>();
        
        curinga = inteiros; //wildcard is a super type of any List type

        inteiros = Arrays.asList(5,3,2);
        printList(inteiros);
    }

     //with the wildcard type we can make methods that receive any type of generic
    public static void printList(List<?> list) {
        for(Object o : list) {
            System.out.println(o);

            //obs: i can't  add item in a Wildcard List  (->"String upcasting to Integer - Error")
            //list.add(3);
        }
    }
}
