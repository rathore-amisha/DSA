public class constructors {
    
    public static void main(String[] args) {
        student s1 = new student();//this is default constructor ,which always present.
        s1.roll = 123; 
        student s2 = new student("amisha");
        s2.roll = 12;
        student s3 = new student(20);
        s3.name = "dev";
    }
}

class student{
    String name;
    int roll;

    student(){ //non-parameterized
        System.out.println("constructor called...");
    }
    student(String name){  //this is also constructor, parameterzied
        this.name=name;
        System.out.println("name is :"+name);
    }

    student(int roll){
        this.roll = roll;
        System.out.println("Roll no :"+roll);
    }
}