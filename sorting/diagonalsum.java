import java.util.*;
public class diagonalsum {
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!=matrix.length-i-1)
                sum +=matrix[i][matrix.length-i-1];
        }
return sum;
    }
    public static void main(String args[]){
      int matrix[][] = new int[4][4];
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the element for matrix:");
      for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            matrix[i][j] = sc.nextInt();
        }
    }
      System.out.println(sum(matrix));

 sc.close(); 
    }
}
