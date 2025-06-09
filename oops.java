import java.util.Arrays;

class Student {
    int roll;
    String name;
    float marks;

    Student(){
        this.roll = 53;
        this.name = "Anushka";
        this.marks = 9.5f;
    }
}
public class oops {
    public static void main(String[] args) {
        Student anuuu = new Student();
        // int[] roll = new int[3];
        // String[] name = new String[3];
        // float[] marks = new float[3];
        System.out.println(anuuu.roll);
        System.out.println(anuuu.name);
        System.out.println(anuuu.marks);
    }
}
