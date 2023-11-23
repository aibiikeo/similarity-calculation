import java.util.HashSet;
import java.util.Set;

public class SimilarityCalculator
{
    public void calculateSimilarity(Set<String> set1, Set<String> set2){
        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);

        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);

        System.out.print("\nJaccard Similarity = ");
        System.out.print(Double.valueOf(intersection.size()) / Double.valueOf(union.size()));
    }
}
