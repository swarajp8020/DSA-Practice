package PREP2025.stage1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Ask user for the radius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        // Calculate the area
        double area = Math.PI * radius * radius;
        // Display the result
        System.out.println("The area of circle is: "+ area);
        scanner.close();
    }
}
/* Explanation:
Scanner: Used to take input from the user.
Math.PI: Returns the value of π (approximately 3.14159).
radius * radius: Square of the radius.
area = π * r²: Formula for area of a circle.

*/