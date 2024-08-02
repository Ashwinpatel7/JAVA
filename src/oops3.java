public class oops3 {
//    Creating a new datatype with multiple attribute
    public static class Student{
        String name;
        int Rollno;
        double percentage;
    }
//    Making a constructor

    public static void fun(Student s){
        System.out.println(s.Rollno);
    }
    public static void change(Student s){
        s.Rollno= 68;
    }
    public static void main(String[] args) {
        Student a = new Student();//Declaration
//        Filling out values
        a.name ="Ashwin";
        a.Rollno= 67;
        a.percentage= 98.7;
        fun(a);//What we have done here is that we have created a function through which we are passing the value.
        change(a);
        fun(a);
    }
}

