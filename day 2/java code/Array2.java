import java.util.Scanner;
	public class Array2{
	 public static void main(String[] args){
Scanner input = new Scanner(System.in);
 int[] numbers = new int[10];
  
  for(int counter = 0;counter < 10;counter++){
   System.out.print("Enter scores :  ");
          numbers[counter] = input.nextInt();


  }
for(int index = 0;index <numbers.length;index++){
System.out.println(numbers[index]);
}
}


}