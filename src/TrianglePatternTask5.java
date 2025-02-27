public class TrianglePatternTask5 {
    public static void main(String[] args) {
        System.out.println("Task 5:");
        for (int i = 1; i <= 5; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for columns
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}