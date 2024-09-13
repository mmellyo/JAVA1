import java.util.Random;       
import java.util.Scanner;

//added 2nd comment for test purpoces

public class RPS {
  public static void main(String[] args) {

    // 1* SCANNING THE USER'S INPUT
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter your choice");
    String TempUserChoice = scanner.next().toLowerCase();       //convert input to lowercase 
    char UserChoice = TempUserChoice.charAt(0);           //only take first char

    //validate input 
    if (UserChoice != 'r' && UserChoice != 's' && UserChoice != 'p' ) { 
      System.out.println("Invalid choice! Please enter 'r', 'p', or 's'.");
      scanner.close();
      return;
    }

    System.out.println("Your choice is : "+ UserChoice);
    scanner.close();


    
    // 2* GENERATE A RAND CHOICE
    Random random = new Random();

    char[] possibilities = {'r', 'p', 's'};
    
    //will pick a random from the strig length (0,1 or 2)
    int StringIndex = random.nextInt(possibilities.length); 

    //get the choice 
    char PcChoice = possibilities[StringIndex];

    System.out.println("The pc choice is : "+ PcChoice);



    // 3* comparaison 

  if (UserChoice == PcChoice) {
      System.out.println("It's a tie!");
  } else {
    switch (UserChoice) {
        case 'r' : 
         if (PcChoice == 'p') {
            System.out.println("Paper covers rock. You lose.");
           } else if (PcChoice == 's') {
            System.out.println("Rock crushes scissors. You win!");
           }
            break;

        case 'p' :
         if (PcChoice == 'r') {
            System.out.println("Paper covers rock. You win!");
           } else if (PcChoice == 's') {
            System.out.println("Scissors cut paper. You lose.");
           }
            break;

        case 's' :
         if (PcChoice == 'r') {
            System.out.println("Rock crushes scissors. You lose.");
           } else if (PcChoice == 'p') {
            System.out.println("Scissors cut paper. You win!");
           }
            break;
    }
  }

  }
  
}
