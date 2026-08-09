// import java.util.*;
public class strings {
    //Strings are immutable in java.

    public static void printletter(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
       /*  int arr[]={'a','b','c','d'};
        String str = "abc";
        String str2 = new String("xyz");
        Scanner sc= new Scanner(System.in);

        String name = sc.next(); // only one word like - Tony
        String name1 = sc.nextLine(); //full sentence.

        System.out.println(name1);
*/
        String fullName = "Amisha Rathore";
        System.out.println(fullName.length()); //length() use like this bcz it is a fun in string.

        //concatenation
        String firstName = "Amisha";
        String lastName = "rathore";
        String name = firstName +" "+ lastName;
        System.out.println(name);
         printletter(lastName);
    }
}
