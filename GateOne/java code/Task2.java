import java.util.Scanner;
   public class Task2{
 	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int average = 0;
  int total = 0; 

 for(int i = 0; i < 10;i++){
System.out.print(" Enter number : ");
    int num = input.nextInt();
total = total + num;
average = total/10;
}
  System.out.print("The total average of the numbers are " + average);
 

 








}
}