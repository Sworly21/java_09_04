package hu.petrik.javaSokszog;

public class Teglalap extends Sokszog{
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getKerulet(){
        return 2 * (super.getA() + this.b);
    }

    public double getTerulet(){
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f b = %f %S"
                , this.getA(), this.getB(), super.toString()) ;
    }
}
