package ThucHanh;

import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);// declare scanner system input
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: "+area);
    }
}
