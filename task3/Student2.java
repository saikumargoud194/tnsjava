
 public class Student2 {
    private String name;
    private int id;
    static String college = "ABC University";
    private static int counter = 100;
    public Student2(String name) {
        this.name = name;
        this.id = counter++; 
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }
    public static void changeCollege(String newCollege) {
        college = newCollege;
    }
}