import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        Collections.shuffle(arr);
        Integer[] ans=arr.toArray(new Integer[0]);
        for (Integer value : ans) {
            System.out.print(value + " ");
        }

    }
}
