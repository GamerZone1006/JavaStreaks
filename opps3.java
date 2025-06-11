// class Bigsis{
//     void good(){
//         System.out.println("Good");
//     }
// }

// class Smallsis extends Bigsis{
//     void bad(){
//         System.out.println("Bad");
//     }
// }

class Box{
    double length = 10;
    double width = 5;
    double height = 10;

    void showBox(){
        System.out.println("Hello, I'm a box.");
    }
}

class BoxWeight extends Box{
    double weight = 20;
    void showWeight(){
        System.out.println("My weight is "+weight);
    }
}

class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other){
        super();
        this.cost = other.cost;
        System.out.println(cost);
    }
}

public class opps3 {
    public static void main(String[] args) {
        // Smallsis ss = new Smallsis();
        // ss.good();
        // ss.bad();
        // BoxWeight bw = new BoxWeight();
        // bw.showBox();
        // bw.showWeight();
        BoxPrice bp = new BoxPrice();
        bp.cost = 50;
        BoxPrice bp2 = new BoxPrice(bp);
    }
}
