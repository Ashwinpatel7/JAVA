public class Student {
    // Attributes
    private String name;
    private int rno;
    private double percent;

    final String schoolName ="BCS" ;
    static int numberOfStudents;

    // Constructor
    public Student(String name, int rno, double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRno() {
        return rno;
    }

    public double getPercent() {
        return percent;
    }

    // Setter methods (optional, for modifying values later)
    public void setName(String name) {
        this.name = name;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    // Display information method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rno);
        System.out.println("Percentage: " + percent + "%");
    }

    public static void main(String[] args) {
        // Creating an instance of the class using the constructor
        Student student1 = new Student("John Doe", 101, 85.5);

        // Accessing and displaying information using getter methods
        System.out.println("Student Information:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRno());
        System.out.println("Percentage: " + student1.getPercent() + "%");
        System.out.println(student1.schoolName);



        // Displaying information using the displayInfo method
        student1.displayInfo();

        // Modifying values using setter methods
        student1.setName("Jane Smith");
        student1.setPercent(92.3);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        student1.displayInfo();
    }
}
