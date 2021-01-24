

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateString {
    public static String[] dup(String[] arr) {

        List<String> names = Arrays.asList(arr).stream().collect(Collectors.toList());
        System.out.println(Arrays.toString(names.toArray()));

        int[] numbs = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> numbsList = Arrays.stream(numbs).boxed().collect(Collectors.toList());

        char[] chars = {'A', 'B', 'C'};
        List<Character> charsList = Arrays.asList(chars).stream().collect(Collectors.toList());
        return arr;
    }


    public static void main(String[] args) {
        String[] arg = {"kelless","keenness"};
        System.out.println(dup(arg));
    }
}
