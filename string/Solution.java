// Question 4 : Determine if 2 Strings are anagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be
// anagrams. Consider race and care. In this case, race's characters can be formed into a study,
// or care's characters can be formed into race. Below is a java program to check if two strings
// are anagrams or not.

/*public class anagram_check {

public static boolean isAnagram(String str1 , String str2){
    for(int i=0;i<str1.length();i++){
        for(int j=0;j<str2.length();j++){
            if(str1.charAt(i) == str2.charAt(j)){
                return true;
            }
        }
    } return false;

}
    public static void main(String[] args){
       String s1="race";
       String s2 ="care";
       System.out.println(isAnagram(s1,s2));
    }
} */

import java.util.Arrays;

public class Solution {
public static void main(String[] args) {
String str1 = "earth";

String str2 = "heart";

//Convert Strings to lowercase. Why? so that we don't have to check

// separately for lower & uppercase.
str1 = str1.toLowerCase () ;
str2 = str2.toLowerCase ();

// First check - if the lengths are the same
if(str1.length() == str2.length () ) 
    {
// convert strings into char array
char [] strlcharArray = str1.toCharArray () ;
char[] str2charArray = str2.toCharArray ();

// sort the char array
Arrays.sort (strlcharArray);
Arrays.sort (str2charArray) ;
// if the sorted char arrays are same or identical then the strings are



boolean result = Arrays.equals (strlcharArray, str2charArray) ;
if (result) {
System.out.println(str1 + " and " + str2 + " are anagrams of each other");

} else {
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");

} }else {
// case when lengths are not equal
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
}

}}