/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex06;

/**
 *
 * @author Dethrall
 */
class InvalidEmailAddressException extends Exception {

    public InvalidEmailAddressException(String wrong_Email_Address) {
        super(wrong_Email_Address);
    }
    
    public InvalidEmailAddressException(String wrong_Email_Address, Throwable t) {
        super(wrong_Email_Address, t);
    }
    
}
