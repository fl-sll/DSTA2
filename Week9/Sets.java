import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String> ();
        set1.add("Hello");
        set1.add("World");
        
        System.out.println("Set1: " + set1);

        Set<String> set2 = new HashSet<String> ();
        set2.add("Hello");
        set2.add("Class");

        System.out.println("Set2: " + set2);

        Set<String> union = new HashSet<String> ();
        union.addAll(set1);
        union.addAll(set2);

        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<String> (set1);
        intersection.retainAll(set2);

        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<String> (set1);
        difference.removeAll(set2);

        System.out.println("Difference: " + difference);
    }
}
