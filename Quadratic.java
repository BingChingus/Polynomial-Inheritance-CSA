public class Quadratic extends Trinomial 
{
    private double discriminant;

    public Quadratic(int a, int b, int c)
    {
        super(2, a, b, c);
        discriminant = Math.pow((double) b,2.0) - 4 * (a * c);
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
        return (-1 * super.getMidCoeff() + Math.sqrt(discriminant)) / (double) (2 * super.getLeadCoeff());
    }

    public String toString()
    {
        return super.toString() + ", Formula: " + super.getLeadCoeff() + "x^2 + " + super.getMidCoeff() + "x + " + super.getLastCoeff();
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
