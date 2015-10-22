/* Copyright 2015 Hochschule Luzern - Technik & Architektur */
package age_SW6_Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Holds address relevant fields of one person. Person are equals if they have
 * the same names and the same ZIP code.
 *
 * @author ???
 */
public final class AddressEntry {

    private String fistName;
    private String lastName;
    private int zip;
    private String city;
    private String phone;
    private String eMail;

    /**
     * Create an entry with the initial values.
     */
    public AddressEntry(String fistName, String lastName, int zip) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.zip = zip;

        // Ergänzen!
    }

    public AddressEntry(String firstName, String lastName, int zip, String city, String phone, String eMail) throws IllegalArgumentException,InvalidEmailAddressException {
        this.fistName = fistName;
        this.lastName = lastName;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
        this.eMail = eMail;
        
         if (firstName == null || containsNumbers(firstName) || firstName.length() > 20 || firstName.equals(lastName) || String.valueOf(zip).length() != 4) {
            throw new IllegalArgumentException();
        }
        if (validate(eMail)) {
            throw new InvalidEmailAddressException(eMail);
        }

    }
    
     private boolean containsNumbers(String s) {
        Pattern p = Pattern.compile(".*\\d.*");
        // Pattern for the numbers 0..9
        return p.matcher(s).find();
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * Get the value of fistName.
     *
     * @return the value of fistName
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * Get the value of lastName.
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get the value of zip.
     *
     * @return the value of zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * Get the value of city.
     *
     * @return the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Get the value of eMail
     *
     * @return the value of eMail
     */
    public String getEMail() {
        return eMail;
    }
}
