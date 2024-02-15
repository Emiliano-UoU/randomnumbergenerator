
/**
 * Write a description of class wqef here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class randomNumberGenreator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class wqef
     */
    public static void main(String args[])
    {
        int max =4;//max
        int min =1;//min
        int range = max -min +1;
        int y=0;
        int x=0;
        for(int i=0; i< 100; ++i){
            int rand = (int)(Math.random()*range)+min;//randomator
            if(rand==1 ){
                y++;
                System.out.println("is y"+y+ rand);

            }
            if (rand >1){
                x++;
                System.out.println("is x"+ x+rand );
            }
        }

    }
}
