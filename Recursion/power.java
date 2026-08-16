//optimized power function

public class power {
    public static int optimizedPow(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPow(a, n/2);  //Time com reduce to = o(logn)
        // int halfsqr = optimizedPow(a,n/2)*optimizedPow(a,n/2)   Tn =o(n)
        int halfsqr = halfPower * halfPower;
       
        //for odd power value
        if(n % 2 !=0){
            halfsqr = a*halfsqr;
        }
        return halfsqr;
    }
    public static void main(String[] args) {
        int a =2;
        int n= 10;
        System.out.println(optimizedPow(a, n));
    }
}
