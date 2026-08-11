// Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;
public class vowel_count {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("enter the string:");
        s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' ||ch =='e' ||ch =='i'||ch == 'o'||ch == 'u'){
                count++;
            }
        }
        System.out.println("count of vowels :"+count);
    sc.close(); }
   
}
