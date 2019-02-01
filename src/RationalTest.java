public class RationalTest {

    public static void main(String[] args) {
        Rational r=new Rational(125,60);
        Rational r2= new Rational (1,2);
        System.out.println("The first rational is "+r);
        System.out.println("The second rational is "+r2);
        String reduced=r.reduce();
        System.out.println("The first Reduced = "+reduced);
        String sum = r.add(r2);
        System.out.println("The sum of the two rationals = "+sum);
        String product = r.multiply(r2);
        System.out.println("The product of the two rationals = "+product);
    }
}
