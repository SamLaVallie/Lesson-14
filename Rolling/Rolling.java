import java.util.Random;
/**
 * Write a description of class Rolling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rolling
{
    // instance variables - replace the example below with your own
    private Random myDie;
    private int first;
    private int second;
    private int third;
    private int counter;
    
    /**
     * Constructor for objects of class Rolling
     */
    public Rolling()
    {
        // initialise instance variables
        this.myDie = myDie;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void rollDice(){
        while (first == second || first == third || third == second){
            first = (int)(Math.random() * 6) + 1;
            second = (int)(Math.random() * 6) + 1;
            third = (int)(Math.random() * 6) + 1;
            System.out.println(" " + first + " " + second + " " + third);
            counter++;
            System.out.println("---------");
        }
        System.out.println("The count is " + counter);
  }
}
