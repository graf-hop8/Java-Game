import java.util.Scanner;
/**
 * Write a description of class CopyOfCopyOfMemoryGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MemoryGame
{
   
    public static void main (String [] args)
    {
       
       Scanner kb = new Scanner(System.in);
       int choice = 0;
       int score = 0;
       int inputx = 0;
       int inputy = 0;
       int inputx2 = 0;
       int inputy2 = 0;
       //print answer screen
        String [][] animals = {
            {"cow", "dog", "cow", "cat"},
            {"horse", "hen", "dog", "horse"},
            {"duck", "cat", "mouse", "mouse"},
            {"sheep", "hen", "duck", "sheep"}, 
            };
        String [][] animals2 = {
            {"cow", "dog", "cow", "cat"},
            {"horse", "hen", "dog", "horse"},
            {"duck", "cat", "mouse", "mouse"},
            {"sheep", "hen", "duck", "sheep"}, 
            };
            for (int i = 0; i < animals.length; i++)
        {
            for(int j = 0; j < animals.length; j++)
            {
                System.out.print(animals[i][j] + "\t");        
            }
            System.out.println(" ");
        }
        
         //print game instructions
       System.out.println("\nGAME INSTRUCIONS");
       System.out.println("The goal of the game is to remember the coordinates of the same words on the table");
       System.out.println("Enter the cooridnates of your first word");
       System.out.println("Enter the cooridnates of your second word");

       //clear answer screen 
        System.out.println("Enter s to play");
        System.out.println("WARNING! Once you press s, the table will disappear so make sure that you remember the table well");
          String answer = " ";
          answer = kb.nextLine();
        if(answer.equals("s"))
         {
                System.out.print('\u000C');
         }
       do{
          System.out.println("Enter The First Coordinates");
          inputx = kb.nextInt();
          inputy = kb.nextInt();
          System.out.println("Enter The Second Coordinates");
          inputx2 = kb.nextInt();
          inputy2 = kb.nextInt();
          if(animals[inputx][inputy] == animals2[inputx2][inputy2])
          {
           System.out.println("card: " + animals[inputx][inputy]);
           System.out.println("card: " + animals2[inputx2][inputy2]);
           score = score + 5;
           System.out.println("Its a match");
           System.out.println("Your current score is " + score);  
          }
          else 
          {
           System.out.println("card: " + animals[inputx][inputy]);
           System.out.println("card: " + animals2[inputx2][inputy2]); 
           System.out.println("Its not a match");  
          }
          if(score == 25)
          {
           System.out.println("You win!!!! Final score: " + score );
          }
          System.out.println("Enter 1 to continue");
          choice = kb.nextInt();
        }while(choice == 1);
       System.out.println("Your Final Score is " + score);
            
            
    
       
         
        
    
       
       
       
       
       
       
       
    }
}
