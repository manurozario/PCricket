import java.util.Scanner;
import java.util.Random;
public class GameMechanics
{
 private Random rand = new Random();
 private Scanner memes;
 private Player p1;
 private int overs;
 private int totalOvers;
 private int balls;
 private String [] currentGameWheel;
 private int computerRuns;
 private int[] fakeNumbers = {0,1,2,3,4,5,6,7,8,9};
 private Wheel wh;
 
 GameMechanics(int o, Player p)
 {
   this.balls = 0;
   this.totalOvers = o;
   this.overs = 0;
   this.p1 = p;
   wh = new Wheel();
   this.currentGameWheel = wh.elements;
 }
 
   public void wheelGenerator(){
     wh = new Wheel();
     this.currentGameWheel = wh.elements;
     


    }
  
 
 public void playGame()
 {
   
   Random rand2 = new Random();
   Scanner memes = new Scanner(System.in);
   String log = "";
   
   this.computerRuns = rand.nextInt(35) + 5;                                                    //  Sets computer runs, run target for players
   System.out.println("Computer has scored " + this.computerRuns + ".");    
   System.out.println("Score " + (this.computerRuns+1) + " runs in " + (this.totalOvers * 6) + " balls to win the match!");
   
   
   
   while(p1.getWickets() < 9 || p1.getRuns() <= computerRuns || (this.overs == this.totalOvers)){
     p1.printScore();
     printWheel();
     System.out.println("Enter a number.");
     int guess = memes.nextInt();
     while(guess>10){
     System.out.println("Error, enter a number between 0 and 9.");
     guess = memes.nextInt();
     }
     
     
     wheelChecker(this.currentGameWheel[guess], log);
     log = this.currentGameWheel[guess];
     
     if(p1.getRuns() >  this.computerRuns)
     {
       p1.winScreen();
       break;
     }
     if(this.balls == 0 && this.overs == this.totalOvers){
         p1.outOfBalls();
         if(computerRuns >= p1.getRuns()){
           System.out.println("You lost by " + (this.computerRuns - p1.getRuns()));
         }
         break;
         
     }
     
   
   }
   
   
 }

 
 public void wheelChecker(String s, String prev)
 {
   
   if((s.equals("W") || s.equals("LBW")))
   {
      if(prev.equals("No Ball"))
     {
       setOvers();
       return;
     }
     System.out.println("OUT!!!");
     p1.checkForWicket(true);
     setOvers();
   }
   
   else if(s.equals("No Ball"))
   {
     System.out.println("No Ball!");
     System.out.println("Free Hit!");
     p1.checkForExtras();
   }
   
   else if(s.equals("Wide"))
   {
     System.out.println("WIDE!");
     p1.checkForExtras();
   }
   
   else
   {
     p1.addRuns(Integer.parseInt(s));
     System.out.println("You need " + (this.computerRuns - p1.getRuns()) + " runs to win the match." );
     setOvers();
   }
   
 }
 
 
 public void setOvers()
 {
   this.balls++;
   if(this.balls == 6)
   {
     this.overs++;
     this.balls = 0;
   }
 }
 
 public String[] printWheel()
 {
   String [] array = this.currentGameWheel;
   System.out.println("Overs: " + this.overs + " Balls: " + this.balls);
   System.out.println();
   System.out.print(" | ");
   for(int i = 0; i < array.length; i++)
   {
     System.out.print(array[i] + " | ");
   
   }
     System.out.println();
    
     
   return array;
 }
                       
 
 public void printBoard(String[] w)
 {
   System.out.print(" | ");
   for(int i = 0; i < w.length; i++)
   {
   System.out.print(w[i] + " | ");
   }
 }
 
 
 

 

 
 
 
 
 
 
 
 
 

 
 
 
}