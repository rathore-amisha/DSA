
public class shortestPath {

    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //weast
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 =x*x;
        int y2 =y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        String s1 ="tony";
        // String s2 = "tony";  //it store the vlue in old string
        String s3 = new String("tony"); //use new -pointed the new string


        // if(s1 == s2){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }
        // if(s1 == s3){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }

        //equal()-func check only value
        if(s1.equals(s3)){
            System.out.println("string are equal");
        }else{
            System.out.println("strings are not equal");
        }

    }
}
