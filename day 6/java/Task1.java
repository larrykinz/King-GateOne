import java.util.Scanner;

public class AgeCalculator{
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

  System.out.println("Enter your date of birth (DD/MM/YYYY):");
      String[] dateOfBirth = scanner.next().split("/");

   int monthOfBirth = Integer.parseInt(dateOfBirth[0]);
    int dayOfBirth = Integer.parseInt(dateOfBirth[1]);
   int yearOfBirth = Integer.parseInt(dateOfBirth[2]);

        int presentYear = 2024;

        int age = currentYear - yearOfBirth;

        System.out.println("Your age is: " + age);
    }
}


    
