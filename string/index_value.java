public class index_value {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
          System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String name = "Tony";
        System.out.println(name.charAt(0));

        //charAt()-a func used to find each element at every index

        String st ="Crompton";
        printletter(st);
    }
}
