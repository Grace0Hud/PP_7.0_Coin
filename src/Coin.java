import java.util.Random;
public class Coin
{
    protected final int HEADS = 0;
    protected final int TAILS = 1;

    protected int face;

    //sets up coin by first flip
    public Coin()
    {
        flip();
    }//end of coin constuctor

    //flips coin by randomly choosing a face value
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }//end of flip method

    //returns true if the furrent face of the coin is heads
    public boolean isHeads()
    {
        return (face == HEADS);
    }//end of isHeads

    //returns teh current face of the coin as a string
    public String toString()
    {
        String faceName;
        if(face == HEADS) {
            faceName = "Heads";
        }else
        {
            faceName = "Tails";
        }
        return faceName;
    }//end of toString
}//end class coin
