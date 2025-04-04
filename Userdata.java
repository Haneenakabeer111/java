package haneena;

import java.util.Scanner;

public class Userdata {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Enter a double: ");
            double doublenum = scanner.nextDouble();
            scanner.nextLine();  
            
            System.out.print("Enter a float value: ");
            float floatnum = scanner.nextFloat();
            scanner.nextLine();  
            
            System.out.print("Enter a boolean value (true/false): ");
            boolean booleanValue = scanner.nextBoolean();
            scanner.nextLine(); 
            
            System.out.println("string: " + name);
            System.out.println("integer: " + num);
            System.out.println("float: " + floatnum);
            System.out.println("Double: " + doublenum);
            System.out.println("Boolean: " + booleanValue);
        }
    }
}
