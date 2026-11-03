public class Vacuum {
    public static void main(String[] args) {
        char A = 'D', B = 'D';
        int pos = 0;

        while (A == 'D' || B == 'D') {
            if (pos == 0) {
                if (A == 'D') {
                    A = 'C';
                    System.out.println("Suck Room A");
                } else {
                    pos = 1;
                    System.out.println("Move Right to B");
                }
            } else {
                if (B == 'D') {
                    B = 'C';
                    System.out.println("Suck Room B");
                } else {
                    pos = 0;
                    System.out.println("Move Left to A");
                }
            }
        }
        System.out.println("Both rooms are clean!");
    }
}