public class pair {
    public static int FriendsPair(int n){
        //base condition
        if(n ==1 || n ==2){
            return n;
        }

        //single
        int Fnm1 = FriendsPair(n-1);

        //pair
        int fnm2 = FriendsPair(n-2);
        int pairWay = (n-1) * fnm2;

        int totalWay = Fnm1 + pairWay;
        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(FriendsPair(4));
    }
}
