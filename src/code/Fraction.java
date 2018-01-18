package code;

public class Fraction
{
    private int num;
    private int denom;

    public Fraction(int num, int denom)
    {
        if (denom == 0)
        {
            throw new IllegalArgumentException("Fractions cant have a 0 denominator");
        }
        else
        {

        }
    }

    public static int gcf(int a, int b)
    {
        int min = Math.min(a, b);
        for(int i = min; i > 0; i--)
        {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }


    public String toString()
    {
        return num + " / " + denom;
    }

    public Fraction multiply (Fraction f)
    {
        return new Fraction(num*f.num, denom*f.denom);
    }
    public Fraction divide (Fraction f)
    {
        return new Fraction(num*f.denom, denom*f.num);
    }


    public static int lcm (int a, int b)
    {
        int mult = Math.max(a, b);

        while (mult % a != 0 && mult % b != 0)
        {
            mult += Math.max(a, b);
        }

        return mult;
    }

    private void simplify ()
    {
        int factor = gcf (num, denom);
        num /= factor;
        denom /= factor;
    }
}
