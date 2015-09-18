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
public class Spar extends Konto{
    private double maxOut;

    public Spar(double maxOut, double saldo, double rate) {
        super(saldo, rate);
        this.maxOut = maxOut;
    }
    
    @Override
    public double getSaldo()
    {
        return super.getSaldo();    
    }
    
    
    
}
