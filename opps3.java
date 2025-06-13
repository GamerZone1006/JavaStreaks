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

// class Box{
//     double length = 10;
//     double width = 5;
//     double height = 10;

//     void showBox(){
//         System.out.println("Hello, I'm a box.");
//     }
// }

// class BoxWeight extends Box{
//     double weight = 20;
//     void showWeight(){
//         System.out.println("My weight is "+weight);
//     }
// }

// class BoxPrice extends BoxWeight{
//     double cost;
//     BoxPrice(){
//         super();
//         this.cost = -1;
//     }
//     BoxPrice(BoxPrice other){
//         super();
//         this.cost = other.cost;
//         System.out.println(cost);
//     }
// }

// class Shapes{
//     void area(){
//         System.out.println("All shapes have area.");
//     }
// }

// class Circle extends Shapes{
//     @Override
//     void area(){
//         System.out.println("Area is π * r * r");
//     }
// }

// class Triangle extends Shapes{
//     void area(){
//         System.out.println("Area is 0.5 * b * h");
//     }
// }

// class Square extends Shapes{
//     void area(){
//         System.out.println("Area is s * s");
//     }
// }

//Complie time/static polymorphism
// class Numbers{
//     int add(int a, int b){
//         return a+b;
//     }
//     double add(double a, double b){
//         return a+b;
//     }
//     int add(int a, int b, int c){
//         return a+b+c;
//     }
// }

//Run time/dynamic polymorphism
// class Animal{
//     void sounnd(){
//         System.out.println("hahahaha");
//     }
// }

// class Doggy extends Animal{
//     @Override
//     void sounnd(){
//         System.out.println("Bhaw bhaw");
//     }
// }

// class Catu extends Animal{
//     @Override
//     void sounnd(){
//         System.out.println("Meow meow");
//     }
// }

//Abstract classes
abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("zzzz...");
    }
}

class Doggy extends Animal{
    @Override
    void sound(){
        System.out.println("bhaw bhaw");
    }
}

class Catu extends Animal{
    @Override
    void sound(){
        System.out.println("meowww");
    }
    void how(){
        System.out.println("badmasssshhh");
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
        // BoxPrice bp = new BoxPrice();
        // bp.cost = 50;
        // BoxPrice bp2 = new BoxPrice(bp);

        // Shapes shape = new Shapes();
        // Shapes circ = new Circle();
        // Square sq = new Square();
        // circ.area();

        //Static/Complie time polymorhism
        // Numbers num = new Numbers();
        // System.out.println(num.add(2,3));
        // num.add(2, 3, 4);
        // System.out.println(num.add(4.6,3.4));

        //Runtime polymorphism
        // Animal a;
        // a = new Doggy();
        // a.sounnd();
        // a = new Catu();
        // a.sounnd();

        //Abstract Class
        Doggy dog = new Doggy();
        dog.sound();
        dog.sleep();
        Catu cat = new Catu();
        cat.how();
    }
}
