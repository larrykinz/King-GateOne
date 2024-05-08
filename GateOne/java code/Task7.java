import java.util.Scanner;
   public class Task7{
 	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int index = 0;
  int total = 0;
  int average = 0; 

 for(int i = 1; i < 11;i++){  
System.out.print(" Enter number : ");
    int num = input.nextInt();
  if(num % 2 == 0){
total = total + num;
average = total/10;
}
}
   System.out.println("The total of only  the even numbers are " + total);
  System.out.println("The average of only  the even numbers are " + average);
}
}