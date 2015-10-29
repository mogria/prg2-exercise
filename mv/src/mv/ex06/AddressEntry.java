/* Copyright 2015 Hochschule Luzern - Technik & Architektur */
package mv.ex06;

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
     *
     * @param firstName
     * @param lastName
     * @param zip
     * @param email
     * @throws IllegalArgumentException
     * @throws InvalidEmailAddressException
     */
    public AddressEntry(String firstName, String lastName, int zip, String email) throws  IllegalArgumentException, InvalidEmailAddressException{
        if (firstName == null || containsNumbers(firstName) || firstName.length() > 20
                || lastName == null || containsNumbers(lastName) || lastName.length() > 20
                || String.valueOf(zip).length() != 4) {
            throw new IllegalArgumentException("The arguments for AddressEntry are wrong!");
        }
        if(checkEmail(email)){
            throw new InvalidEmailAddressException("Wrong Email Address");
        }

        this.fistName = fistName;
        this.lastName = lastName;
        this.zip = zip;
        this.eMail = email;

        // Ergänzen!
    }

    private boolean checkEmail(String email){
        return email.contains("@");
    }
    
    private boolean containsNumbers(String s) {
        Pattern p = Pattern.compile(".*\\d.*"); // Pattern for the numbers 0..9
        return p.matcher(s).find();
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
