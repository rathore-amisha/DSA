public class removeDupl {

    public static void RemoveDuplicate(String str, int idx,StringBuilder newstr,boolean map[]){
        //base condition
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }


        // work - check duplicate character in string .
        char currChar = str.charAt(idx);


        if(map[currChar - 'a'] == true){
            //duplicate
            RemoveDuplicate(str,idx+1,newstr,map);  //fun call
        }else{
            map[currChar - 'a'] = true;
             RemoveDuplicate(str, idx+1, newstr.append(currChar), map); // fun call
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}
