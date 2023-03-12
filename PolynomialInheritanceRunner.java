public class PolynomialInheritanceRunner 
{
    public static void main (String[] args)
    {
        /*-----Test Cases-----*/
        Polynomial polly = new Polynomial(5, 7);
        System.out.println(polly);

        Trinomial trinity = new Trinomial(4, 3, -5, 1);
        System.out.println(trinity);

        Quadratic quinn = new Quadratic(2, 5, -3);
        System.out.println(quinn);

        Polynomial pollySister = new Polynomial(5, 7);
        System.out.println(polly.equals(pollySister));
    
        Trinomial trinityBrother = new Trinomial(4, 3, -5, 1);
        System.out.println(trinity.equals(trinityBrother));

        Quadratic quinnSister = new Quadratic(2, 5, -3);
        System.out.println(quinn.equals(quinnSister)); 

        System.out.println(quinn == quinnSister);

        System.out.println(quinn.hasRealSolutions()); 

        System.out.println(quinn.firstZero()); 

        System.out.println(quinn.secondZero());

        System.out.println(quinn.isPerfectSquare());

        Quadratic quinton = new Quadratic(9, 12, 4);
        System.out.println(quinton.isPerfectSquare());
    }    
}
