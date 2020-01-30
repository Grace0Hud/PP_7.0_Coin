public class CoinDriver
{
    public static void main(String[] args)
    {
        //testing
//        Coin yes = new Coin();
//        System.out.println(yes);

        //all monetary coins for computation
        MonetaryCoin penny = new MonetaryCoin(0.01);
        MonetaryCoin nickle = new MonetaryCoin(0.05);
        MonetaryCoin dime = new MonetaryCoin(0.10);
        MonetaryCoin quarter = new MonetaryCoin(0.25);
        MonetaryCoin halfDollar = new MonetaryCoin(0.50);

        double sum = penny.getValue() + nickle.getValue() + dime.getValue() + quarter.getValue() + halfDollar.getValue();

        System.out.println("Sum of all the coins: " + sum);
        System.out.println(penny);
        penny.flip();
        System.out.println("Flipping penny....");
        if(penny.isHeads())
        {
            System.out.print("Penny is heads");
        }else
        {
            System.out.print("Penny is tails");
        }



    }//end of main method
}//end coin driver class
