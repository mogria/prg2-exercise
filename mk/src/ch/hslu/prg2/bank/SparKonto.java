package ch.hslu.prg2.bank;

/**
 *
 * @author mogria
 */
public class SparKonto extends Konto {
    double maxOut;

    public SparKonto(double maxOut, double saldo, double rate) {
        super(saldo, rate);
        this.maxOut = maxOut;
    }
    
    public double getMaxOut() {
        return maxOut;
    }

    @Override
    public void payIn(double in) {
        super.payIn(in);
    }

    @Override
    public void payOut(double out) {
        if(out < maxOut) {
            super.payOut(out);
        }
    }

    @Override
    public String toString() {
        return "SparKonto[no=" + getNo() + ", saldo=" + getSaldo() + ", rate=" + getRate() + ", maxOut=" + maxOut + "]";
    }
    
}
