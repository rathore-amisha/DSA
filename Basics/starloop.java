public class starloop {
    public static void main(String[] args){
        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }
        int n=120983;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit +" ");
            n=n/10;
        }
    }
}
