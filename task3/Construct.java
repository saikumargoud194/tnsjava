 
public class Construct  {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 21);
        s1.display();
        s2.display();
        s3.display();
    }
}
