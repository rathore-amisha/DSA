public class prime {
   
       public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++) //optimized function,usse less no. to check prime
        {
            if(n%i == 0){
                return false;
            }
        }return true;
    }
    
    public static void prime_range(int p){
   for(int i=2;i<=p;i++){
    if(isprime(i))// true-prime
    {
        System.out.print(i+" ");
    }
   }
    }

    public static void main(String[] args){
        prime_range(20);
    }
}
