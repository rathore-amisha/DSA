//find no. of ways to reach from (0,0) to (n-1,m-1) in a N X M grid.
// allowed moves - right or down.

public class grid {

    public static int GridWays(int i, int j, int m, int n){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }
        int w1 = GridWays(i+1, j, m, n);
        int w2 = GridWays(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args){
        int n = 3;
        int m= 3;
        System.out.println("Number of ways :"+GridWays(0, 0, m, n));

    }
}
