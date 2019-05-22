public class Player
{
  private int runs;
  private int wickets;
  private boolean wicket;
  private int extras;
  private String name;

  
 
  
  public Player(String n)
  {
    this.name = n;
    this.runs = 0;
    this.wicket = false;
    this.extras = 0;
  }
  
  public void printScore()
  {
    
    System.out.println("Scoreboard: ");
    System.out.println("Player Name: " + this.name);
    System.out.println(this.runs + "/" + this.wickets);
    System.out.println("Extras: " + (this.extras));
    
  }
  
  public void checkForExtras()
  {
    this.extras++;
    addRuns(1);
    
  }
    public void outOfBalls(){
    System.out.println("Innings over!");
  }
  
  public void addRuns(int run)
  {
    this.runs += run;
    
  }
  
  public boolean gameOver()
  {
    System.out.println("All out!");
    return false;
  }
  
  public void checkForWicket(boolean b)
  {
    if(b == true)
    {
      this.wickets++;
      
    }
    if(this.wickets > 9)
    {
      gameOver();
      
    }
  }
  
  public void winScreen()
  {
    System.out.println("You won!");
    
    
  }
  
  public int getWickets()
  {
    return this.wickets;
  }
  
  public int getRuns()
  {
    return this.runs;
  }
  
}