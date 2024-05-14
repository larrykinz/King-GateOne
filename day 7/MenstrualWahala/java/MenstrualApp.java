import java.util.Scanner;
import java.util.Calender;

public class MenstrualApp{
    public static void main(String[] args) {
  	 Scanner input = new Scanner(System.in);

         System.out.println("** WELCOME TO MENSTRUAL APP CALCULATOR **");

	 System.out.println("** THIS PROGRAM CALCULATES THE MENSTRUAL CYCLE OF A FEMALE WITHIN THE AGE OF TWELVE(12) AND ABOVE **");

	 

	 System.out.println("Please enter your name : ");
         String name = input.nextLine();
	 
	 String lastFlowMonth;
         while(true){
 	 System.out.println("Please enter your age :");
         int age = input.nextInt();
  	 if(age < 12){
	 System.out.println("With all due respect GET LOST, this program is not for you.");break;
}

         
	 System.out.println("Please enter your average complete menstrual cycle days : ");
         int days = input.nextInt();

	 System.out.println("when was your first flow date : ");
	 int FirstFlowdate = input.nextInt();
          
         System.out.println("when was your last flow date : ");
	 int lastFlowDate = input.nextInt();

         

         
	 
}
}
}