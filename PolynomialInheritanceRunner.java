public class PolynomialInheritanceRunner 
{
    public static void main (String[] args)
    {
        Polynomial p1 = new Polynomial(4, 2);
        Polynomial p2 = new Polynomial(4, 2);
        Polynomial p3 = new Polynomial(1, 2);
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        Trinomial t1 = new Trinomial(5, 2, 1, 4);
        Trinomial t2 = new Trinomial(5, 2, 1, 4);
        Trinomial t3 = new Trinomial(4, -2, 1, 4);
        System.out.println(t1);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

        Quadratic q1 = new Quadratic(3, 1, 2);
        Quadratic q2 = new Quadratic(3, 1, 2);
        Quadratic q3 = new Quadratic(1, 1, -6);
        System.out.println(q1);
        System.out.println(q1.equals(q2));
        System.out.println(q1.equals(q3));
        System.out.println(q3.hasRealSolutions());
        System.out.println(q1.hasRealSolutions());
        System.out.println(q3.firstZero());
    }    
}
