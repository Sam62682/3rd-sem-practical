public class p2 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));   // Bitwise AND
        System.out.println("a | b = " + (a | b));   // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b));   // Bitwise XOR
        System.out.println("~a = " + (~a));         // Bitwise NOT
        System.out.println("a << 2 = " + (a << 2)); // Left shift
        System.out.println("a >> 2 = " + (a >> 2)); // Right shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        System.out.println("c = " + c);
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 2; // c = c % 2
        System.out.println("c %= 2: " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 10;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("d = " + d);
    }
}