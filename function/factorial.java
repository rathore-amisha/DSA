// import java.util.*;
public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;

    }
    public static int binomial_coeff(int n, int r){
        int f_n=fact(n);
        int f_r=fact(r);
        int f_nmr=fact(n-r);

        int binomial= f_n/(f_nmr*f_r);
        return binomial;
    }
    public static void main(String[] args){

    //    System.out.println("factorial :"+fact(8));
       System.out.println("Binomial coefficient :"+binomial_coeff(5, 2));
    }
}
