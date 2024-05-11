import java.util.ArrayList;

public class GR {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // for (int i = 0; i <= arr.size(); i++) {
        //     System.out.println("Index " + i + ": " + arr.get(i));
        // }

        for (int i:arr) {
            System.out.println(i);
        }


    }    
}