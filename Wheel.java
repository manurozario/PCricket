import java.util.ArrayList;
import java.util.Random;

public class Wheel {

    ArrayList <String> wheel = new ArrayList<>();
    public String [] elements = {"W", "Wide", "4", "6", "2", "LBW", "0", "No Ball", "3", "1"};
    Random rnd = new Random();
 
    //  Constructor directly creates a new wheel for the board
    Wheel() {
        for (int i = 0; i < elements.length; i++) {
            wheel.add(elements[i]);
        }
        elements = this.randomCircle();

    }
    
    

    public String getStuff(int index)
    {
        return(this.wheel.get(index));
    }


//  randomCircle: returns an array with the elements randomly sorted using an ArrayList
    private String[] randomCircle()
    {
        String [] str = new String[10];
        boolean [] switches = new boolean[10];

        int count = 0;
        int incre = 10;


        while(count < this.wheel.size()){
            int randomnum = rnd.nextInt(100) + 1;
            if(randomnum > 100)
            {
                randomnum = 100;
            }
            if(randomnum <= 10 && (switches[0] == false))
            {
                str[count] = getStuff(0);
                switches[0] = true;
                count++;

            }
            if((randomnum <= 20 && randomnum > 10) && (switches[1] == false))
            {
                str[count] = getStuff(1);
                switches[1] = true;
                count++;

            }
            if((randomnum <= 30 && randomnum > 20) && (switches[2] == false))
            {
                str[count] = getStuff(2);
                switches[2] = true;
                count++;

            }
            if((randomnum <= 40 && randomnum > 30) && (switches[3] == false))
            {
                str[count] = getStuff(3);
                switches[3] = true;
                count++;

            }
            if((randomnum <= 50 && randomnum > 40) && (switches[4] == false))
            {
                str[count] = getStuff(4);
                switches[4] = true;
                count++;

            }
            if((randomnum <= 60 && randomnum > 50) && (switches[5] == false))
            {
                str[count] = getStuff(5);
                switches[5] = true;
                count++;

            }
            if((randomnum <= 70 && randomnum > 60) && (switches[6] == false))
            {
                str[count] = getStuff(6);
                switches[6] = true;
                count++;

            }
            if((randomnum <= 80 && randomnum > 70) && (switches[7] == false))
            {
                str[count] = getStuff(7);
                switches[7] = true;
                count++;

            }
            if((randomnum <= 90 && randomnum > 80) && (switches[8] == false))
            {
                str[count] = getStuff(8);
                switches[8] = true;
                count++;

            }
            if(randomnum > 80 && (switches[9] == false))
            {
                str[count] = getStuff(9);
                switches[9] = true;
                count++;

            }
            System.out.print("Loading-");


        }
        return str;
    }


}
