public class MonetaryCoin extends Coin
{
    private double value = 0;

    public MonetaryCoin(double value)
    {
        super();
        this.value = value;
    }//end of monetary coin constructor

    //gets the value of the coin
    public double getValue()
    {
        return value;
    }//end of getValue

    public String toString()
    {
        String output = "A coin worth $" + value;
        output += "\nCurrently on " + super.toString() + "\n";
        return output;
    }//end of string method
    
}//end of monetarycoin class
