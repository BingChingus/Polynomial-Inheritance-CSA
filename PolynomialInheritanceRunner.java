public class PolynomialInheritanceRunner 
{
    public static void main (String[] args)
    {
        Polynomial p1 = new Polynomial(1, 1);
        Polynomial p2 = new Polynomial(1, 1);
        Polynomial p3 = new Polynomial(5, 3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }    
}
