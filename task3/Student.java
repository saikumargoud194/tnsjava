public class Student {
    private String name;
    private int age;
    // Constructor 1: No arguments
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    // Constructor 2: One argument
    public Student(String name) {
        this.name = name;
        this.age = 0;
    }
    // Constructor 3: Two arguments
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
