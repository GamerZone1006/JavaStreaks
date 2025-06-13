//Interfaces
// interface Remote{
//     void turnOn();
//     void turnOff();
// }

// class TV implements Remote{
//     public void turnOn(){
//         System.out.println("TV is on");
//     }
//     public void turnOff(){
//         System.out.println("TV is off");
//     }
// }

// class AC implements Remote{
//     public void turnOff(){
//         System.out.println("AC is off");
//     }
//     public void turnOn(){
//         System.out.println("AC is on");
//     }
// }

// interface Car{
//     void start();
//     void stop();
//     void accelerate();
//     default void common(){
//         System.out.println("All cars have engine.");
//     }
// }

// class Tata implements Car{
//     public void start(){
//         System.out.println("Best start");
//     }
//     public void stop(){
//         System.out.println("Best stop");
//     }
//     public void accelerate(){
//         System.out.println("Best acceleration");
//     }
// }

// class Tesla implements Car{
//     public void start(){
//         System.out.println("EV start");
//     }
//     public void stop(){
//         System.out.println("EV stop");
//     }
//     public void accelerate(){
//         System.out.println("EV acclerate");
//     }
// }

//Extending interfaces
// interface A{
//     void methodA();
// }

// interface B extends A{
//     void methodB();
// }

// class Hehe implements B{
//     public void methodA(){
//         System.out.println("method A");
//     }
//     public void methodB(){
//         System.out.println("method b");
//     }
// }

//Multiple intefaces
// interface A{
//     void methodA();
// }

// interface B{
//     void methodB();
// }

// interface C extends A, B{
//     void methodC();
// }

// class Haha implements C{
//     public void methodA(){
//         System.out.println("A");
//     }
//     public void methodB(){
//         System.out.println("B");
//     }
//     public void methodC(){
//         System.out.println("C");
//     }
// }

//Nested Interfaces

// import Outer.Inner;

// class Outer{
//     interface Inner{
//         void sayHi();
//     }
// }

// class ImpInner implements Outer.Inner{
//     public void sayHi(){
//         System.out.println("nested.");
//     }
// }

//Interface inside interface
interface Parent{
    void parentInterf();
    interface Child{
        void childInterf();
    }
}

class IinsideI implements Parent{
    public void parentInterf(){
        System.out.println("Mei bhar wala hu");
    }
    public void childInterf(){
        System.out.println("Mei andar wala hu");
    }
}

public class opps4 {
    public static void main(String[] args) {
        // TV r1 = new TV();
        // AC r2 = new AC();
        // r1.turnOn();
        // r2.turnOff();

        // Car c1 = new Tata();
        // Car c2 = new Tesla();
        // c1.start();
        // c2.stop();

        // Hehe haha = new Hehe();
        // haha.methodB();
        // haha.methodA();

        // Haha hehe = new Haha();
        // hehe.methodA();
        // hehe.methodB();
        // hehe.methodC();

        // ImpInner nest = new ImpInner();
        // nest.sayHi();

        IinsideI in = new IinsideI();
        in.parentInterf();
        in.childInterf();
    }
}
