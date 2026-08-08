// import java.util.*;
public class binary_deci {
    public static void binTodeci(int binum){
        int mynum =binum;
        int pow=0;
        int dec=0;
        while(binum >0){
            int lastdigit = binum % 10;
            dec= dec + (lastdigit*(int)Math.pow(2,pow));

            pow++;
            binum= binum/10;
        }
        System.out.println("decimal of "+ mynum + "= "+dec );
    }

    public static void decTobin(int decnum){
        int num=decnum;
        int pow=0;
        int bin=0;
        while(decnum > 0){
            int rem = decnum %2;
            bin = bin + (rem *(int)Math.pow(10,pow));
            pow++;
            decnum= decnum/2;
        }
        System.out.println("Binary form of number "+ num +" = "+bin);
    }
    public static void main(String args[]){
        binTodeci(100);
        decTobin(5);
    }
}
