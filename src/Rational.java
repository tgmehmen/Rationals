public class Rational {
    private int num;
    private int denom;
    public Rational(){
        num=1;
        denom=1;
/**This comment can be seen externally*/
    }
    public Rational(int num,int denom){
        if (denom==0){
            throw new IllegalArgumentException("The denominator cannot be 0");
        }
        else if (num<0 || denom<0){
            throw new IllegalArgumentException("Both the numerator and denominator must be positive");
        }
        else {
            this.num = num;
            this.denom = denom;
        }
    }
/** returns string of rational in reduced from */
    public String reduce(){
        int num1=num/this.GCD();
        int denom1=denom/this.GCD();
        return (num1+"/"+denom1);
    }
    private int GCD(){
        int a = num;
        int b = denom;
        int c = num%denom;

        while(c>0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
    public String add(Rational b){
        int denom1=this.denom*b.denom;
        int top1= this.num*b.denom;
        int top2= b.num*this.denom;
        int top = top1+top2;
        Rational r1=new Rational(top,denom1);
        return (r1.reduce());
    }


    public String multiply(Rational b){
        int denom1=this.denom*b.denom;
        int num1=this.num*b.num;
        Rational r1=new Rational(num1,denom1);
        return (r1.reduce());
    }
    public String toString() {
        return (num+"/"+denom);
    }
}
