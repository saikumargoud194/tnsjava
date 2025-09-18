 public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        //Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment operators
        System.out.println("\nAssignment Operators:");
        int c = 15;
        System.out.println("Initial c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 -> " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 -> " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 -> " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 -> " + c);
    }
}
