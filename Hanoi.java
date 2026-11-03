public class Hanoi {
    static int step = 1;
    static String A = "1,2,3", B = "-", C = "-";

    static void move(char from, char to) {
        String disk = "";
        if(from=='A') { disk=A.split(",")[0]; A=A.substring(disk.length()).replaceFirst("^,",""); }
        if(from=='B') { disk=B.split(",")[0]; B=B.substring(disk.length()).replaceFirst("^,",""); }
        if(from=='C') { disk=C.split(",")[0]; C=C.substring(disk.length()).replaceFirst("^,",""); }

        if(to=='A') A=disk+(A.equals("-")?"":","+A);
        if(to=='B') B=disk+(B.equals("-")?"":","+B);
        if(to=='C') C=disk+(C.equals("-")?"":","+C);

        System.out.println("\nStep "+step+++": "+from+" -> "+to);
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C);
    }

    static void solve(int n, char a, char b, char c) {
        if(n==1) { move(a,c); return; }
        solve(n-1,a,c,b);
        move(a,c);
        solve(n-1,b,a,c);
    }

    public static void main(String[] args) {
        System.out.println("Initial: A=1,2,3  B=-  C=-");
        solve(3,'A','B','C');
    }
}