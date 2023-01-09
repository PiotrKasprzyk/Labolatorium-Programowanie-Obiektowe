public class Punkt {
    double a, b;

    public Punkt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Punkt() {
        this(0.0, 0.0);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void zeruj() {
        a = 0.0;
        b = 0.0;
    }

    public String opis() {
        return "Punkt{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void przesun(double da, double db) {
        a += da;
        b += db;
    }
}