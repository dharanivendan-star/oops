class Student
{
    String name;
    int age;
    int  regno;

    void combination()
    {
        System.out.println("student name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Register no : "+regno);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Student dva = new Student();
        dva.name="Dharani vendan";
        dva.age = 17;
        dva.regno = 60;

        dva.combination();
    }
}

