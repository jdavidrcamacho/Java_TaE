import java.util.Scanner;

class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + area);
        
        scanner.close(); // Close the scanner to release resources
    }

    // Function to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        double pi = Math.PI; // Using the Math.PI constant for pi
        double area = pi * (radius * radius);
        return area;
    }
}