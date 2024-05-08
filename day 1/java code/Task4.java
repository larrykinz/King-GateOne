import java.util.Scanner;
   public class Task4{
 	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int index = 0;
  int total = 0; 

 for(int i = 1; i < 11;i++){  
System.out.print(" Enter number : ");
    int num = input.nextInt();
  if(i % 2 == 0){
total = total + num;}
}

  System.out.println("The total  even indexes of the numbers are " + total);
 

 








}
}