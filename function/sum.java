public class sum {
    public static int add(int a,int b){
       return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    //fun to calculate float sum
    public static float add(float a, float b){
        return a+b;
    }

    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        //for(int i=2;i<=n-1;i++)
        for(int i=2;i<=Math.sqrt(n);i++) //optimized function,usse less no. to check prime
        {
            if(n%i == 0){
                return false;
            }
        }return true;
    }

    //sum digit in integer
    public static int sumDigit(int n){
        int sum=0;
        int r;
        while(n >0){
            r= n% 10;
            sum = sum +r;
            n=n/10;

        }
        return sum;
    }

    
    public static void main(String[] args){
        System.out.println("sum of two number "+add(2,3));
        System.out.println("sum of three num "+add(2,3,5));
        System.out.println("sum of float :" +add(2.0f,3.1f));
        System.out.println(isprime(9));

        System.out.println("sum of digit in integer : "+ sumDigit(12574));
    }
}
