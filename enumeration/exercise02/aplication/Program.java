package enumeration.exercise02.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import enumeration.exercise02.entities.Comment;
import enumeration.exercise02.entities.Post;

public class Program {

    public static void main(String[] args) throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    Comment c1 = new Comment("Hey, have a nice trip");
    Comment c2 = new Comment("Wow, this place is crazy");
    Comment c3 = new Comment("That's awesome");
    Post p1 = new Post(
        sdf.parse("17/12/2023 05:43:27"),
         "Traveling to New Zealand",
          "I'm going to visit this wordeful country",
           12);  
    p1.addComment(c1);
    p1.addComment(c2);
    p1.addComment(c3);
    System.out.println(p1);

    System.out.println();

    Comment c4 = new Comment("Good night, man!");
    Comment c5 = new Comment("may the force be with you");
    Post p2 = new Post(
        sdf.parse("17/12/2023 23:12:41"),
         "Good night guys",
          "See you tomorrow",
           7);  
    p2.addComment(c4);
    p2.addComment(c5);
    System.out.println(p2);

    }
}
