import java.util.*; 
public class Puzzle { 
    static int h(int[][] a) { 
        int c=0, k=1; 
        for(int[] r:a) 
            for(int v:r) { 
                if(v!=0 && v!=k) c++; 
                k++; 
            } 
        return c; 
    } 
    static void print(int[][] a) { 
        for(int[] r:a) 
            System.out.println(Arrays.toString(r)); 
        System.out.println(); 
    } 
    public static void main(String[] args) { 
        int[][] a={{1,2,3},{4,0,6},{7,5,8}}; 
        int[][] m={{0,1},{0,-1},{1,0},{-1,0}}; 
        print(a); 
        while(h(a)>0) { 
            int x=0,y=0,bx=-1,by=-1,best=999; 
 
            for(int i=0;i<3;i++) 
                for(int j=0;j<3;j++) 
                    if(a[i][j]==0) {x=i;y=j;} 
 
            for(int[] d:m) { 
                int i=x+d[0],j=y+d[1]; 
                if(i>=0 && i<3 && j>=0 && j<3) { 
                    int t=a[x][y]; a[x][y]=a[i][j]; a[i][j]=t; 
                    if(h(a)<best) {best=h(a);bx=i;by=j;} 
                    t=a[x][y]; a[x][y]=a[i][j]; a[i][j]=t; 
                } 
            } 
 
            if(bx==-1) break; 
            int t=a[x][y]; a[x][y]=a[bx][by]; a[bx][by]=t; 
            print(a); 
        } 
        System.out.println("Goal Reached!"); 
    } 
} 