package code;

public class Runner
{
    public static void main(String[] args)
    {
        Fraction f1 = null;
        try
        {
            f1 = new Fraction(3, 0);
        }
        catch(Exception e)
        {
            System.out.println("Fractions need a non-zero denominator");
        }
        System.out.println(f1);


        Fraction myFraction = new Fraction(12, 4);
        System.out.println(myFraction);

        System.out.println(Fraction.lcm(7, 5));
    }
}
