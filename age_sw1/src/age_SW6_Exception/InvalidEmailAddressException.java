/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW6_Exception;

/**
 *
 * @author Adrian
 */
public class InvalidEmailAddressException extends Exception {

    public InvalidEmailAddressException(String s) {
        super("Invalide Email Address: " +s);
    }

    public InvalidEmailAddressException(String message, Throwable cause) {
        super("Invalide Email Address: " +message, cause);
    }
    
}
