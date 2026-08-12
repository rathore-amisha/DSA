public class basics {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a object p1 of pen . constructor
        // p1.setcolor("blue");
        p1.setcolor("pink");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.tip);

        //access modifier
        BankAccount a1 = new BankAccount();
        a1.username="amisha";
        // a1.password("abscsk");  can't directly access becz it is private.
        
        a1.setPassword("abhdrnfnull");
    }
}

class Pen{
    // String colour;
    private String colour;
    int tip;

    //getter
    String getcolor(){
        return this.colour; //return the current colour /object.
    }
    int gettip(){
        return this.tip;
    }

    //setter
    //fun
    void setcolor(String newcolor){
        colour=newcolor;
    }

    void setTip(int n){
        tip = n;
    }

}

//acess modifier
class BankAccount{
    public String username;
    private String password;
    
    void setPassword(String s){
        password = s;
    }

    // Getter for demonstration (not recommended for real passwords)
    String getPassword() {
        return password;
    }
    
}
