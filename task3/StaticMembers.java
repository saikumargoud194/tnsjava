 
public class StaticMembers {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Alice");
        Student2 s2 = new Student2("Bob");
        s1.display();
        s2.display();
        Student.changeCollege("XYZ Institute");
        s1.display();
        s2.display();
    }
}
