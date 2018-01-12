package code;

public class Fraction
{
    public Fration(int num, int denom)
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

    private void simplify()
    {

        int gcf(num, denom);
        num /= factor;
        denom /= factor;
    }
}
