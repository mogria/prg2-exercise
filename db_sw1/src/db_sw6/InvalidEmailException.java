/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw6;

/**
 *
 * @author Diego
 */
public class InvalidEmailException extends Exception {

    public InvalidEmailException(String message, Throwable t) {
        super(message, t);
    }
    
    public InvalidEmailException(String message) {
        super(message);
    }
    
    
}
