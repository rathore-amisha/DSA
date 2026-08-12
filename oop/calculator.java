public class calculator {
    public static void main(String[] args) {
        // calc s1 =new calc();
        // System.out.println(s1.sum(5,6));
        // System.out.println(s1.sum((float)9,(float)4));
        // System.out.println(s1.sum(5,6,2));

        Deer d1 = new Deer();
        d1.eats();// it print child class fun,as it is child class object
        
    }
}
//fun overriding
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}

//polymorphism-fun overloading(compile time overloading)
class calc{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}