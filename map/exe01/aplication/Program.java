package map.exe01.aplication;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    
    public static void main(String[] args) {
        
        //  KEY     VALUE
        Map<String, String> cookies = new TreeMap<>();
  
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "3456765432");

        cookies.remove("email");

        //if the key already exists, its will be override
        cookies.put("phone", "236528735");

        System.out.println("contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("phone number: " + cookies.get("phone"));
        //if i try get a nonexistent key, the returned value will be NULL
        System.out.println("email: " + cookies.get("email"));
        System.out.println("size: " + cookies.size());

        System.out.println("ALL COOKIES");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
