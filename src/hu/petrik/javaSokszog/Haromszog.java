package hu.petrik.javaSokszog;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

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

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
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

    public double getKerulet(){
        return this.getA() + this.getB() + this.getC();
    }
    public double getTerulet(){
        return 10;
    }
    private double getS(){
        return getKerulet() /2;
    }

    @Override
    public String toString() {
        return "Haromszog{}";
    }
}
