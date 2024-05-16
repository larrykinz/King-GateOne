import java.util.Scanner;

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

	 System.out.println("Please enter your average flow date : ");
	 int averageFlowDate = input.nextInt();
         
         System.out.println("Please enter your last menstrual date : ");
          int lastMenstrualDate = input.nextInt();

	 System.out.println("Please enter your last menstrual month number: ");
          int lastMenstrualMonth = input.nextInt();

	 System.out.println("Please enter your last menstrual Year : ");
          int lastMenstrualYear = input.nextInt();

        int nextPeriodDay = lastMenstrualDate + days;
        int nextPeriodMonth =  lastMenstrualMonth;
	int nextPeriodYear = lastMenstrualYear;



        if (nextPeriodDay > 30) {
	nextPeriodDay -= 30;
	nextPeriodMonth++;
	if (nextPeriodMonth > 12) {
	nextPeriodMonth -= 12;
        nextPeriodYear++;
}
}

        int ovulationDay = lastMenstrualDate + (days / 2);
	int ovulationMonth = lastMenstrualMonth;
	int ovulationYear = lastMenstrualYear;



	if (ovulationDay > 30) {
	ovulationDay -= 30;
	ovulationMonth++;
	if (ovulationMonth > 12) {
	ovulationMonth -= 12;
	ovulationYear++;
}
}
	int safePeriodStartDay = lastMenstrualDate + (days - 5);
	int safePeriodStartMonth = lastMenstrualMonth;
	int safePeriodStartYear = lastMenstrualYear;

	if (safePeriodStartDay > 30) {
	safePeriodStartDay -= 30;
	safePeriodStartMonth++;
	if (safePeriodStartMonth > 12) {
	safePeriodStartMonth -= 12;
	safePeriodStartYear++;


}
}

	int safePeriodEndDay = lastMenstrualDate + (days - 1);
	int safePeriodEndMonth = lastMenstrualMonth;
	int safePeriodEndYear = lastMenstrualYear;



if (safePeriodEndDay > 30) {
safePeriodEndDay -= 30;
safePeriodEndMonth++;
if (safePeriodEndMonth > 12) {
safePeriodEndMonth -= 12;
safePeriodEndYear++;
}
}


	System.out.println("Next period: " + nextPeriodMonth + "/" + nextPeriodDay  + "/" + nextPeriodYear);

	
	System.out.println("Ovulation: " + ovulationMonth + "/" + ovulationDay + "/" + ovulationYear);


	System.out.println("Safe period start: " + safePeriodStartMonth + "/" + safePeriodStartDay + "/" + safePeriodStartYear);


	System.out.println("Safe period end: " + safePeriodEndMonth + "/" + safePeriodEndDay + "/" + safePeriodEndYear);



break;
}


	


 
          

         

         
	 

}
}