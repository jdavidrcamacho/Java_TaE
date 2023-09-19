import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lenght of the side: ");

        double lenght = scanner.nextDouble();
        double area = calculateSquareArea(lenght);

        System.out.println("The area of the square is: " + area);
        scanner.close(); // Close the scanner to release resources
    }

    // Function to calculate the area of a circle
    public static double calculateSquareArea(double lenght) {
        double area = lenght * lenght;
        return area;
    }

}
