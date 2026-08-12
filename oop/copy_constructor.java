public class copy_constructor {
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "shruti";
        s1.roll = 20;
        s1.password = "abcz";
        
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=100;

        student s2 = new student (s1);
        s2.password = "xyz";
        s2.marks[2] = 70;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class student{
    String name;
    int roll;
    String password ;
    int marks[];


    //  student(student s1){  // shallow copy constructor
    //      this.name = s1.name;
    //      this.roll = s1.roll;
    //      this.marks = s1.marks;
    //      System.out.println(name);
    //      System.out.println(roll);
    //  }

    //deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }


    student(){
        System.out.println("constructor called");
    }
}