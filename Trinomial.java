public class Trinomial extends Polynomial 
{
    private int leadCoeff;
    private int midCoeff;
    private int lastCoeff;

    public Trinomial(int degree, int leadCoeff, int midCoeff, int lastCoeff)
    {
        super(degree, 3);
        this.leadCoeff = leadCoeff;
        this.midCoeff = midCoeff;
        this.lastCoeff = lastCoeff;       
    }

    /*-----Accessors-----*/
    public int getLeadCoeff()
    {
        return leadCoeff;
    }

    public int getMidCoeff()
    {
        return midCoeff;
    }

    public int getLastCoeff()
    {
        return lastCoeff;
    }

    /*-----Other Methods-----*/
    public String toString()
    {
        return super.toString() + ", Lead Coefficient: " + leadCoeff + ", Middle Coefficient: " + midCoeff + ", Last Coefficient: " + lastCoeff;
    }

    public boolean equals(Trinomial t)
    {
        if (super.equals(t) && (this.leadCoeff == t.leadCoeff && this.midCoeff == t.midCoeff && this.lastCoeff == t.lastCoeff))
        {
            return true;
        }
        return false;
    }
}
