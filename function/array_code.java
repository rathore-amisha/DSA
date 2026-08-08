// import java.util.*;
public class array_code {

public static void reverse(int num[]){
    int first=0, last=num.length-1;

    while(first<last){
        int temp= num[last];
        num[last]=num[first];
        num[first]= temp;

        first++;
        last--;
    }
}

public static void pair_array(int num[]){
    int tp=0;
    for(int i=0;i<num.length;i++){
        int crr=num[i];
        for(int j=i+1;j<num.length;j++){
            System.out.print("("+crr+","+num[j]+")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs :"+tp);
}



    public static void main(String args[]){
        // int marks[]= new int[50];

        // Scanner sc = new Scanner(System.in);

        // System.out.println("length of array : "+marks.length);
        // System.out.println("enter the marks : ");

        // marks[0] = sc.nextInt(); //physics marks
        // marks[1]= sc.nextInt();  //chem
        // marks[2]= sc.nextInt(); //math
        // marks[2]= marks[2]+10;  //update the value

        // System.out.println("phy :"+marks[0]);
        // System.out.println("chem :"+marks[1]);
        // System.out.println("math :"+marks[2]);

        
        // int percentage =(marks[0]+marks[1]+marks[2])/3;
        // System.out.println("percentage :"+percentage +"%");
        // sc.close();

        int n[]={2,4,8,10,5};
        // reverse(n);
        // System.err.print("reverse array : ");
        // for(int i=0;i<n[i];i++){
        //     System.out.print(n[i]+" ");
        // }

        pair_array(n);
    }
}