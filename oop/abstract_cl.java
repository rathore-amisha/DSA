//abstract class
public class abstract_cl {

    public static void main(String[] args) {
       /*  horse h1 = new horse();
        h1.eats();
        h1.walk();
        System.out.println(h1.color);*/
        Mustang myhorse = new Mustang();
        myhorse.eats();

        //constructor -(inheritance) called in this manner
        //Animal ->Horse -> Mustang
    }
}



abstract class Animal{  //abstract method
    String color;

    //constructor ,by default always a object created and call a constructor,than firstly parents class constructor called.
    Animal(){
        color="brown";
        System.out.println("Animal class constructor called");
    }
    void eats(){
        System.out.println("eating");
    }
    abstract void walk();  //abstract fun
}


//derived class
class horse extends Animal{
    horse(){
        System.out.println("Horse class constructor called");
    }

 void changecolor(){
    color = "dark Brown";
 }   
    void walk(){
        System.out.println("running");
    }
}


 //derived class
class Mustang extends horse{
    Mustang(){
        System.out.println("Mustang class constructor called..");
    }
}


class chicken extends Animal{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("walking");
    }
}