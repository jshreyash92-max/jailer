import java.util.*;
public class Puzzle1 {
    public static void main(String[] args) {
        String goal = "123456780";
        Queue<List<String>> q = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        q.add(Arrays.asList("123046758"));
        seen.add("123046758");
        int[] d = {1, -1, 3, -3};
        while (!q.isEmpty()) {
            List<String> path = q.poll();
            String s = path.get(path.size()-1);
            if (s.equals(goal)) {
                for (String x : path) {
                    for (int i = 0; i < 9; i++) {
                        System.out.print(x.charAt(i) + " ");
                        if (i % 3 == 2) System.out.println();  }
                    System.out.println();}
                System.out.println("Goal Reached!");
                break;
            }
            int p = s.indexOf('0');
            for (int v : d) {
                int n = p + v;
                if (n >= 0 && n < 9 &&
                    !(v == 1 && p % 3 == 2) &&
                    !(v == -1 && p % 3 == 0)) {
                    char[] a = s.toCharArray();
                    a[p] = a[n];
                    a[n] = '0';
                    String next = new String(a);
                    if (seen.add(next)) {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(next);
                        q.add(newPath);
}}}}}}
