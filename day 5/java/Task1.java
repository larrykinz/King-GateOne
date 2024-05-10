import java.util.Scanner;
	public class Task1{
	 public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your atm card : ");
      String card = input.nextLine();
System.out.print(atmNumber(card));




}
public static boolean atmNumber(String cardNumber){

if(cardNumber.length() != 16){
  return false;
}

int[] count = new int[16];
for(int counter = 0;counter < cardNumber.length();counter++){
count[counter] = input.nextInt();
if(count.length != 4 || count.length != 5 || count.length != 6){
 return false;


}

}

}

}