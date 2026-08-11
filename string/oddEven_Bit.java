public class oddEven_Bit {
    public static void bitManupulation(int n){
      int bitmask = 1;
      if((n & bitmask )== 0){
        //even number
        System.out.println("even number");
      }else{
        System.out.println("odd number");
      }
    }
    public static int getithBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask)== 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithBit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearithBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    //update bit
    public static int updateithbit(int n, int i,int newbit){
        if(newbit == 0){
            return clearithBit(n, i);
        }else{
            return setithBit(n, i);
        }

    }
    public static int clearlastithBit(int n,int i){
        int bitmask = (-1)<<i;
        return n&bitmask;
    }
    public static int clearithBit(int n,int i,int j){
        int a= (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    public static boolean isPowertwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        // bitManupulation(3);
        // bitManupulation(8);
        // bitManupulation(11);

        
        // System.out.println(getithBit(15, 2));
        System.out.println(setithBit(10, 2));
        System.out.println(clearithBit(10, 1));
        System.out.println(updateithbit(10,2,1));
        System.out.println(clearlastithBit(15,2));
        System.out.println(clearithBit(10,2,4));

        System.out.println(isPowertwo(8));
    }
}
