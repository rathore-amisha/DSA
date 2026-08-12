public class StaticKey {
    
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("ronit");
        s1.getname();
        s1.SchoolName = "SVM";

        student s2 = new student();
        System.out.println(s2.SchoolName);
    }
}

class student{
    String name;
    int roll;

    static String SchoolName;

    void setname(String name){
        this.name = name;
    }

    void getname(){
        System.out.println(name);
    }
}

