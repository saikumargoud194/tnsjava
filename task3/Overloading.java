
public class  Overloading  {

    // Method with one parameter
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
         Overloading obj = new Overloading();
        System.out.println("Sum of 2 ints: " + obj.add(10, 20));
        System.out.println("Sum of 3 ints: " + obj.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 4.5));
    }
}
