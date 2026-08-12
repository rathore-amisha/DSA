public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.breath();

        Dog tommy = new Dog();
        tommy.breed= "african";
        tommy.eats();
        System.out.println(tommy.breed);
    }


}
//bash class
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }

}
class Mammel extends Animal{
    int legs;
    void walks(){
        System.out.println("mammel are walking");
    }
}

class Dog extends Mammel{
    String breed;
}


 class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
 }
//derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swim");
//     }
// }
