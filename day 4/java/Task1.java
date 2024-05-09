import java.util.Scanner;
 public class Task1{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 char letter1 = 'x';
 char letter2 = 'o';

     for(int count = 0;count < 9;count++){
  	System.out.print("Enter a number between 1 - 9,to play the game : ");
    		int number = input.nextInt();

     if(number < 1 || number > 9){
   	System.out.println("not a valid number!!!");
		count--;
}



if(number >= 1 && number <= 9){
System.out.println(letter1);
System.out.println(" |  "+letter1+ "|");
System.out.println(" |  " + " |  ");
System.out.println(" |  " + " |  ");
letter1 = letter2;


}
}








}
}