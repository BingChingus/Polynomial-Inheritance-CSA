public class Quadratic extends Trinomial 
{
    private double discriminant;

    public Quadratic(int a, int b, int c)
    {
        super(2, a, b, c);
        discriminant = Math.pow(b,2.0) - 4 * (a * c);
    }

     /*-----Accessors-----*/
    public double getDiscriminant()
    {
        return discriminant;
    }

    /*-----Other Methods-----*/
    public boolean hasRealSolutions()
    {
        if (discriminant >= 0)
        {
            return true;
        }
        return false;
    }

    public double firstZero()
    {
        return (-1 * getMidCoeff() + Math.sqrt(discriminant)) / (double) (2 * getLeadCoeff());
    }

    public double secondZero()
    {
        return (-1 * getMidCoeff() - Math.sqrt(discriminant)) / (double) (2 * getLeadCoeff());
    }

    public boolean isPerfectSquare()
    {
        if (Math.pow(getMidCoeff(), 2) == 4 * getLeadCoeff() * getLastCoeff())
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return super.toString() + ", Formula: " + getLeadCoeff() + "x^2 + " + getMidCoeff() + "x + " + getLastCoeff();
    }

    public boolean equals(Quadratic q)
    {
        if (super.equals(q))
        {
            return true;
        }
        return false;
    }
}
