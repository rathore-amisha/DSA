
public class palindrom {

    public static   boolean isPalindrome(int n){
        int num=n;
        int r;
        int s = 0;
        while(n >0){
            r= n% 10;
            s = s*10 +r;

            n=n/10; }

        if( s == num){
            return true;
        }else{return false;}
           
    }

    public static void main(String args[]){
        System.out.println("is number a palindrome : "+ isPalindrome(121));
    }

}