class Student implements Cloneable{
    int rollno;
    String name;
    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class opps6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "Mjo");
        Student clone = (Student) s1.clone();
        System.out.println();
    }
}
