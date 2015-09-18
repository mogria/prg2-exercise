/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW1_DAT;

/**
 *
 * @author Adrian
 */
public class Konto {
    public static int count = 0;
    
    private int no;
    private double saldo;
    private double rate;

    public Konto() {
     no = Konto.count;
     Konto.count++;
    }

    public Konto(double saldo, double rate) {
        this();
        this.saldo = saldo;
        this.rate = rate;
    }
    
    
    
    public void payIn(double cash)
    {
        saldo = getSaldo() + cash;
    }
    public void payOut(double cash)
    {
        saldo = getSaldo() - cash;
    }

    @Override
    public String toString()
    {
        return (String.valueOf(no) + " " + String.valueOf(getSaldo()) + " " + String.valueOf(rate));
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
}
