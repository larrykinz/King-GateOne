import java.util.Scanner;
   public class Task5{
 	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int index = 0;
  int total = 0; 

 for(int i = 1; i < 11;i++){  
System.out.print(" Enter number : ");
    int num = input.nextInt();
  if(num % 2 == 0){
total = total + num;}
}

  System.out.println("The sum of only  the even numbers are " + total);
 

 








}
}