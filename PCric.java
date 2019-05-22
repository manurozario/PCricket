import java.util.Scanner;
public class PCric
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the game! Please enter your name.");
    
    Scanner memes = new Scanner(System.in);

    
    Player p1 = new Player(memes.nextLine());
    GameMechanics gm = new GameMechanics(5, p1);
    gm.playGame();
    
    
  }
  
  
  
  
}