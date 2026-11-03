import java.util.*;

public class WaterJug {
    public static void main(String[] args) {
        Stack<int[]> st = new Stack<>();
        Set<String> seen = new HashSet<>();

        st.push(new int[]{0, 0});

        while (!st.empty()) {
            int[] s = st.pop();
            int a = s[0], b = s[1];

            if (!seen.add(a + "," + b)) continue;

            System.out.println("4L Jug = " + a + ", 3L Jug = " + b);

            if (a == 2 || b == 2) {
                System.out.println("Goal Reached!");
                break;
            }

            st.push(new int[]{4, b});
            st.push(new int[]{a, 3});
            st.push(new int[]{0, b});
            st.push(new int[]{a, 0});
            st.push(new int[]{a - Math.min(a, 3-b), b + Math.min(a, 3-b)});
            st.push(new int[]{a + Math.min(b, 4-a), b - Math.min(b, 4-a)});
        }
    }
}