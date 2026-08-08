// import java.util.*;
public class trap_runningWater {
    public static int trapWater(int height[]){
        int n = height.length;

        //calculate max left boundary:-
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
 //calculate maximum right boundary:-
      int rightmax[] = new int[n];
      rightmax[n-1] = height[n-1];  
      for(int i=n-2;i>=0;i--){
        rightmax[i] = Math.max(height[i], rightmax[i+1]);
      }   
      
//loop
int trappedWater=0;
for(int i=0;i<n;i++){
    //waterlevel = min(left,right)

    int waterlevel = Math.min(leftmax[i] , rightmax[i]);

    //Trapped water = waterlevel - height[i]

    trappedWater += waterlevel - height[i];
}      
   return trappedWater; 
}
public static void main(String args[]){
    int num[] = {4,2,0,6,3,2,5};
    int wt=trapWater(num);
    System.out.println("trapped water :"+wt);
}
    
}
