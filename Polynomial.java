public class Polynomial
{
    private int degree;
    private int terms;

    public Polynomial(int degree, int terms)
    {
        this.terms = terms;
        if (degree > 0)
        {
            this.degree = degree;
        }
        else
        {
            this.degree = 0;
        }
    }

    /*-----Accessors-----*/
    public int getDegree()
    {
        return degree;
    }

    public int getTerms()
    {
        return terms;
    }

    /*-----Other Methods-----*/
    public String toString()
    {
        return "Degree: " + degree + ", Terms: " + terms; 
    }

    public boolean equals(Polynomial p)
    {
        if (this.degree == p.degree && this.terms == p.terms)
        {
            return true;
        }
        return false;
    }
}