public class TileProblem {

public static int tileprob(int n){
    //base condition
    if(n == 0|| n == 1){
        return 1;
    }
    //make choice
    //vertical
    int Fnm1 = tileprob(n-1);

    //horizontal
    int Fnm2 = tileprob(n-2);
    int totalWay = Fnm1 + Fnm2;
    return totalWay;
}

    public static void main(String[] args) {
        System.out.println(tileprob(4));
        
    }
}