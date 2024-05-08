import java.util.Scanner;
   public class Task8{
 	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int index = 0;
  int total = 0;
  int average = 0; 

 for(int i = 1; i < 11;i++){  
System.out.print(" Enter a valid score between 0 - 100 : ");
    int num = input.nextInt();
  if(num >= 0 && num <= 100){
total = total + num;
}
}
   System.out.println("The sum of   the valid score are " + total);
}
}