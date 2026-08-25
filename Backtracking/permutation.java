public class permutation {

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursive case
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            //use substring to delete the value
            //"abcde" = ab+ de delete c
          String  str2= str.substring(0,i)+str.substring(i+1);
            findPermutation(str2, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, " ");
    }
}
