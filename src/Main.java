import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordProcessor wp = new WordProcessor();
        String t1 = "\\Users\\ASUS\\Desktop\\Similarity calculation\\src\\textfile1.txt";
        String t2 = "\\Users\\ASUS\\Desktop\\Similarity calculation\\src\\textfile2.txt";
        HashSet tf1 = wp.readFile(t1);
        HashSet tf2 = wp.readFile(t2);
        System.out.println("textfile1");
        wp.getDistinctWords(tf1);
        System.out.println("\ntextfile2");
        wp.getDistinctWords(tf2);

        SimilarityCalculator sc = new SimilarityCalculator();
        sc.calculateSimilarity(tf1, tf2);
    }
}