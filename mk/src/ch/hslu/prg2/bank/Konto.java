package ch.hslu.prg2.bank;

/**
 *
 * @author mogria
 */
public class Konto {
    static private int count = 0;
    
    private int no;
    private double saldo;
    private double rate;

    public Konto() {
        no = count++;
    }

    public Konto(double saldo, double rate) {
        this.saldo = saldo;
        this.rate = rate;
    }
    
    public void payIn(double in) {
        saldo += in;
    }
    
    public void payOut(double out) {
        saldo -= out;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNo() {
        return no;
    }

    public double getRate() {
        return rate;
    }
    
    @Override
    public String toString() {
        return "Konto[no=" + no + ", saldo=" + saldo + ", rate=" + rate + "]";
    }
    
}
