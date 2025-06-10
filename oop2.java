//static method using objects
// class Student {
//     int roll;
//     String aanme;
//     static String school = "St. Marys";
// }

//static block
// class Test {
//     static{
//         System.out.println("Static block");
//     }    
// }

//static method for nested class
// class Outer{
//     static class Inner{
//         void show(){
//             System.out.println("Hello");
//         }
//     }
// }

//non static method inside static 

// import java.util.Arrays;

// class Human{
//     int age;
//     String name;
//     int salary;
//     static long population;

//     void speak(){
//         System.out.println("My name is "+name);
//     }

//     Human(int age, String name, int salary, long population){
//         this.age = age;
//         this.name = name;
//         this.salary = salary;
//         Human.population = population;
//     }
// }

//Inheritance

import javax.swing.Box;

class Box {
    double l;
    double b;
    double w;

    Box(){
        this.l = -1;
        this.b = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.b = side;
        this.w = side;
    }

    Box(double l, double b, double w){
        this.l = l;
        this.b = b;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.w = old.w;
    }

    public void info(){
        System.out.println("Box");
    }
}

public class oop2 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // Student s2 = new Student();
        // System.out.println(s1.school);
        // System.out.println(s2.school);
        // System.out.println(Student.school);

        // Test t = new Test();
        // System.out.println("Main block");

        // Outer.Inner obj = new Outer.Inner();
        // obj.show();

        // Human h1 = new Human();
        // h1.name = "Kakashi";
        // h1.speak();
        // Human h2 = new Human(10, "Shikamaru", 100, 10);
        // h2.speak();
        // System.out.println(h2.age+h2.name+h2.salary);

        Box box = new Box(4, 3, 2);
        Box b2 = new Box(box);
        System.out.println(box.l + " "+ box.b+" "+box.w);
    }
}
