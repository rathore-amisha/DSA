public class pattern {

    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            // for(int j=1;j<=i;j++){
            //     System.out.print("*");
            // }

            //inverted star pattern
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}