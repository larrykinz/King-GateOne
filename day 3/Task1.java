import java.util.Random;
import java.util.Scanner;
	public class Task1{
	 public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();

   int random1 = random.nextInt(20);
   int random2 = random.nextInt(20);
int multiplicationRandom = random1 * random2;
int additionRandom = random1 + random2;
int subtractionRandom = random1 - random2;

   for(int count = 0; count <= 10; count++){
    if(multiplicationRandom < 13 && additionRandom > 10){
    System.out.printf("%s%d%s$d%s","what is ", random1, " * ", random2, " : "   );






}
}
}

  
}



