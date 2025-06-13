// class CustomAL<T> {
//     private Object[] data;
//     private int size = 0;
//     private int defCapacity = 10;

//     public CustomAL() {
//         data = new Object[defCapacity];
//     }

//     public void add(T num) {
//         if (isFull()) {
//             resize();
//         }
//         data[size++] = num;
//     }

//     public boolean isFull() {
//         return size == data.length;
//     }

//     public void resize() {
//         Object[] temp = new Object[data.length * 2];
//         for (int i = 0; i < data.length; i++) {
//             temp[i] = data[i];
//         }
//         data = temp;
//     }

//     public T remove() {
//         T removed = (T) data[--size];
//         return removed;
//     }

//     public T get(int index) {
//         return (T) data[index];
//     }

//     public int size() {
//         return size;
//     }

//     public void set(int index, T value) {
//         data[index] = value;
//     }

//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder("[");
//         for (int i = 0; i < size; i++) {
//             sb.append(data[i]);
//             if (i < size - 1)
//                 sb.append(", ");
//         }
//         sb.append("]");
//         return sb.toString();
//     }

// }

//Object Comparison
// class Student implements Comparable<Student>{
//     int rollno;
//     float marks;
//     public Student(int rollno, float marks){
//         this.rollno = rollno;
//         this.marks = marks;
//     }
//     @Override
//     public int compareTo(Student other){
//         if (this.marks > other.marks) {
//             return 1;
//         }
//         else if(this.marks<other.marks){
//             return -1;
//         }
//         else return 0;
//     }
//     @Override
//     public String toString(){
//         return "Roll No:" + rollno + " Marks: "+ marks;
//     }
// }

//Sorting
// import java.util.Arrays;
// class Student implements Comparable<Student>{
//     int rollno;
//     float marks;
//     public Student(int rollno, float marks){
//         this.rollno = rollno;
//         this.marks = marks;
//     }
//     @Override
//     public int compareTo(Student other){
//         return Float.compare(this.marks, other.marks);
//     }
//     @Override
//     public String toString(){
//         return "Roll no: "+rollno+" Marks: "+marks;
//     }
// }

// Lambda functions: to shortent the way to write classes

//Exception Handling - try and catch

public class opps5 {

    public static void main(String[] args) {
        // CustomAL<Integer> list = new CustomAL<>();
        // list.add(5);
        // list.add(4);
        // list.add(3);
        // list.add(2);
        // System.out.println(list);

        // CustomAL<String> s = new CustomAL<>();
        // s.add("Hello");
        // s.add("Hi");
        // System.out.println(s);

        // Student a = new Student(1, 50.0f);
        // Student d = new Student(2, 99.9f); 
        // Student max = (a.compareTo(d)>0) ? a:d;
        // System.out.println("Student with maximum marks is "+max);

        // Student[] students = {
        //     new Student(1, 24.9f),
        //     new Student(2, 60.6f),
        //     new Student(3, 20.8f)
        // };
        // Arrays.sort(students);
        // for(Student s : students){
        //     System.out.println(s);
        // }

        // Myfunction greet = () -> System.out.println("Hello");

        // List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        // Collections.sort(list, (a, b) -> a.length() - b.length());
        // System.out.println(list);

        int a = 5;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("ye toh aise he tp.");
        }
    }
}
