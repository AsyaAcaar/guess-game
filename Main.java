import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;
System.out.println("Welcome to Guess Game!");
while(true){
    System.out.println("Guess the number: ");
    int number1 = input.nextInt();
    if (number==number1){
        System.out.println("You found it. What are u a witch?");
         
    break;

 }  
  
    else {
        System.out.println("Nope.Try again.");
}
        







    }

   }
  }
