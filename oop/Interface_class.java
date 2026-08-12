public class Interface_class {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();

        //multiple inheritance
        deer d1 = new deer();
        d1 .eats();
        d1.like();
    }
}

 interface chessPlayer{
    void moves();
 }

    class Queen implements chessPlayer{
        public void moves(){
            System.out.println("up,down,diagonal,left,right");
        }
    }

    class Rook implements chessPlayer{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }

    //multiple interface using interface
    interface hervibores {
    
        void eats();
    }

    interface carnivores {
        void like();
    }

    class deer implements hervibores,carnivores{
        public void eats(){
            System.out.println("Deer is hervibores");
        }
        public void like(){
            System.out.println("Deer like grasses");
        }
    }