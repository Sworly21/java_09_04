package hu.petrik.javaSokszog;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog() {
        super(getaDouble());
        this.b = getaDouble();
        this.c = getaDouble();
        while(!isSzerkesztheto()){
          super.setA(getaDouble());
          this.b = getaDouble();
          this.c = getaDouble();
        }
    }

    private static double getaDouble() {
        return Math.random() * 10 + 5;
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkezthető");
        }
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    private boolean isSzerkesztheto(){
        if ((this.getA() + this.b) <= this.getC()
                || (this.getC() + this.getA()) <= this.getB()
                || (this.getB() + this.getC()) <= this.getA()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public double getKerulet(){
        return this.getA() + this.getB() + this.getC();
    }
    @Override
    public double getTerulet(){
        return 10;
    }
    private double getS(){
        return getKerulet() /2;
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f b = %f c = %f %s",
        this.getA(), this.getB(), this.getC(), super.toString());
    }
}
