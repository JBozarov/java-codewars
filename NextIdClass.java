Hey awesome programmer!

You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!

Therefore you need a method, which returns the smallest unused ID for your next new data item...

Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!

Go on and code some pure awesomeness!

  
  import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextIdClass {

    public static int nextId(int[] ids) {

        List<Integer> list =new ArrayList<>();
        List<Integer> unusedIds = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();


        for ( int i = 0; i<ids.length; i++ ) {
            list.add(ids[i]);
        }
        int max = Collections.max(list);

        for ( int k = 0; k<=max; k++ ) {
            tempList.add(k);
        }

        for ( int g = 0; g<ids.length; g++ ) {
            if (!list.contains(g) || !tempList.contains(g)) {
                unusedIds.add(g);
            }
        }
        return unusedIds.size()>0 ? Collections.min(unusedIds) : max+1;

    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nextId(arr));
    }
}
