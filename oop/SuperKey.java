public class SuperKey {

    public static void main(String[] args) {
        horse h1 = new horse();
        System.out.println(h1.color);
        
    }
}

class Animal{
    String color="dark brown";
    Animal(){
        System.out.println("Animal class constructor called");
    }
}

class horse extends Animal{
    horse(){
        super.color ="brown";
        // super() ,it present by default also
        System.out.println("horse class constructor called");

    }
}