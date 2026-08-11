public class set_bit {

    public static int countSetbit(int n){
        int count =0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n=n>>1;
        }return count;
    }
    public static int fastExpo(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){ //check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }return ans;
    }
    public static void main(String[] args){
      System.out.println("number of setbit :"+countSetbit(16)); //16=10000 lsb after right shift get only 1
      System.out.println("mulipication with the help of exponential :"+fastExpo(5,3)); 
    }
}
