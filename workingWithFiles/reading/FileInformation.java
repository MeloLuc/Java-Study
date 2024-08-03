package workingWithFiles.reading;

import java.io.File;

public class FileInformation {
    
    public static void main(String[] args) {
        
        File path = new File("/home/lucasmelo/Documents/teste.txt");

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println(path.canExecute());
        System.out.println(path.canRead());
        System.out.println(path.canWrite());
        System.out.println(path.getAbsolutePath());
        System.out.println(path.getTotalSpace());
      // ...

    }
}
