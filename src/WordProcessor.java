import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class WordProcessor {
    public HashSet<String> readFile(String filePath){
        HashSet t = null;
        try{
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            t = new HashSet<String>();
            while(scanner.hasNextLine()){
                t.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return t;
    }
    public void getDistinctWords(HashSet<String> t){
        try {
            for (String i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
