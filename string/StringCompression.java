public class StringCompression {

    public static String compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        // String newstr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count =1;
        //     while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newstr += str.charAt(i);
        //     if(count >1){
        //         newstr += count.toString();
        //     }
        // }
        // return newstr;

        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                 count++;
                 i++;
            }
            sb.append(str.charAt(i));
            if(count >1){
                sb.append(count);
            }
        }
           return sb.toString();
    }
    public static void main(String[] args) {
        String str ="aaabbcccddee";
        System.out.println(compress(str));
    }
}
