public class Kompleks {
    private static int n_kompleks = 0;
    private int real;
    private int imaginer;

    public Kompleks(int real, int imaginer) {
        this.real = real;
        this.imaginer = imaginer;
        n_kompleks++;
    }

    public Kompleks() {
        this.real = 0;
        this.imaginer = 0;
        n_kompleks++;
    }

    public int getReal() {
        return this.real;
    }

    public int getImaginer() {
        return imaginer;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginer(int imaginer) {
        this.imaginer = imaginer;
    }

    public Kompleks plus(Kompleks b){
        Kompleks c = new Kompleks();
        c.setReal(this.real + b.getReal());
        c.setImaginer(this.imaginer + b.getImaginer());
        return c;
    }

    public Kompleks minus(Kompleks b){
        Kompleks c = new Kompleks();
        c.setReal(this.real - b.getReal());
        c.setImaginer(this.imaginer - b.getImaginer());
        return c;
    }

    public Kompleks multiply(Kompleks b){
        Kompleks c = new Kompleks();
        c.setReal(this.real * b.getReal() - this.imaginer * b.getImaginer());
        c.setImaginer(this.real * b.getImaginer() + this.imaginer * b.getReal());
        return c;
    }

    public Kompleks multiply(int c){
        Kompleks d = new Kompleks();
        d.setReal(this.real * c);
        d.setImaginer(this.imaginer * c);
        return d;
    }

    public Kompleks multiply(int c, Kompleks b){
        return b.multiply(c);
    }

    public static int countKompleksInstance() {
        return n_kompleks;
    }

    public void print() {
        if (real != 0) {
            System.out.print(real);
        }
        if (imaginer > 0 && real != 0) {
            System.out.print("+");
        }
        if (imaginer != 0) {
            System.out.print(imaginer + "i");
        }
        if (real == 0 && imaginer == 0) {
            System.out.print(0);
        }
        System.out.println();
    }
}